/*!
 * jquery-pagination-lgh v1.1 (https://github.com/honguangli/jquery-pagination-lgh)
 * Copyright honguangli
 * Licensed under the MIT license
 */
;
(function($) {
  "use strict";
  // 默认配置
  const defaults = {
    page: 1,         // 当前页码
    limit: 10,       // 每页记录数
    total: 0,        // 总记录数
    pageTotal: 1,    // 总页数
    pageShow: 3,     // 展示页码数
    clickFun: null,  // 点击回调事件，切换页码列表时不触发回调
    min: 1,          // 当前最小页码
    max: 3,          // 当前最大页码
    visible: ['start', 'end', 'last', 'next', 'number', 'left', 'right'] // 显示组件
  };

  function Pagination(element, option) {
    this.options = $.extend(false, defaults, option);
    this.element = element;
  }

  Pagination.prototype = {
    // 初始化
    init: function() {
      const self = this;
      const element = self.element;
      const opt = self.options;

      self.refresh();

      // 跳转First
      element.on('click', '.page-start:not(.disabled)', function() {
        gotoStartPage();
      });
      // 跳转Last
      element.on('click', '.page-end:not(.disabled)', function() {
        gotoEndPage();
      });
      // 跳转指定页
      element.on('click', '.page-number:not(.disabled)', function() {
        const target = Number($(this).attr('data-page'));
        gotoTargetPage(target);
      });
      // 跳转Prev
      element.on('click', '.page-last:not(.disabled)', function() {
        gotoLastPage();
      });
      // 跳转Next
      element.on('click', '.page-next:not(.disabled)', function() {
        gotoNextPage();
      });
      // 向左切换分页
      element.on('click', '.page-left:not(.disabled)', function() {
        moveLeft();
      });
      // 向右切换分页
      element.on('click', '.page-right:not(.disabled)', function() {
        moveRight();
      });
      // 跳转First
      function gotoStartPage() {
        if (opt.page === 1) {
          return
        }
        opt.page = 1;
        if ($.isFunction(opt.clickFun)) {
          opt.clickFun(opt.page, opt.limit, opt.total, opt.pageTotal, opt.pageShow);
        }
        self.refresh();
      }

      // 跳转Last
      function gotoEndPage() {
        if (opt.page === opt.pageTotal) {
          return
        }
        opt.page = opt.pageTotal;
        if ($.isFunction(opt.clickFun)) {
          opt.clickFun(opt.page, opt.limit, opt.total, opt.pageTotal, opt.pageShow);
        }
        self.refresh();
      }

      // 跳转指定页
      function gotoTargetPage(target) {
        if (target === opt.page) {
          return
        }
        opt.page = target;
        if ($.isFunction(opt.clickFun)) {
          opt.clickFun(opt.page, opt.limit, opt.total, opt.pageTotal, opt.pageShow);
        }
        self.refresh();
      }

      // 跳转Prev
      function gotoLastPage() {
        if (opt.page <= 1) {
          return
        }
        opt.page = opt.page - 1;
        if ($.isFunction(opt.clickFun)) {
          opt.clickFun(opt.page, opt.limit, opt.total, opt.pageTotal, opt.pageShow);
        }
        self.refresh();
      }

      // 跳转Next
      function gotoNextPage() {
        if (opt.page >= opt.pageTotal) {
          return
        }
        opt.page = opt.page + 1;
        if ($.isFunction(opt.clickFun)) {
          opt.clickFun(opt.page, opt.limit, opt.total, opt.pageTotal, opt.pageShow);
        }
        self.refresh();
      }

      // 左移
      function moveLeft() {
        if (opt.min <= opt.pageShow) {
          return
        }
        opt.max = opt.min - 1;
        opt.min = opt.min - opt.pageShow;
        self.render();
      }

      // 右移
      function moveRight() {
        if (opt.min + opt.pageShow > opt.pageTotal) {
          return
        }
        opt.min = opt.min + opt.pageShow;
        opt.max = Math.min(opt.min + opt.pageShow - 1, opt.pageTotal);
        self.render();
      }
    },
    // 更新
    update: function(options) {
      const self = this;
      $.extend(true, self.options, options);
      self.refresh();
    },
    // 刷新
    refresh: function() {
      const self = this;
      self.minmax();
      self.render();
    },
    // 计算当前显示页码范围
    minmax: function() {
      const self = this;
      const opt = self.options;
      opt.pageTotal = Math.ceil(opt.total / opt.limit);
      if (opt.pageTotal <= 0) {
        opt.page = 1;
        opt.pageTotal = 1;
        opt.min = 1;
        opt.max = 1;
        return
      }
      if (opt.page > opt.pageTotal) {
        opt.min = 1;
        opt.max = Math.min(opt.pageShow, opt.pageTotal);
        return
      }
      const r = opt.page % opt.pageShow;
      opt.min = r === 0 ? opt.page - (opt.pageShow - 1) : opt.page - (r - 1);
      opt.max = Math.min(opt.min + opt.pageShow - 1, opt.pageTotal);
    },
    // 渲染视图
    render: function() {
      const self = this;
      const element = self.element;
      const opt = self.options;
      const visible = opt.visible;
      let html = [];
      html.push('<ul>');
      if (visible.includes('start')) {
        if (opt.page === 1) {
          html.push('<li class="page-start disabled"><a href="javascript:void(0);">First</a></li>');
        } else {
          html.push('<li class="page-start"><a href="javascript:void(0);">First</a></li>');
        }
      }
      if (visible.includes('last')) {
        if (opt.page === 1) {
          html.push('<li class="page-last disabled"><a href="javascript:void(0);">Prev</a></li>');
        } else {
          html.push('<li class="page-last"><a href="javascript:void(0);">Prev</a></li>');
        }
      }
      if (visible.includes('left')) {
        if (opt.min === 1) {
          html.push('<li class="page-left disabled"><a href="javascript:void(0);">&lt;</a></li>');
        } else {
          html.push('<li class="page-left"><a href="javascript:void(0);">&lt;</a></li>');
        }
      }
      if (visible.includes('number')) {
        for (let i = opt.min; i <= opt.max; i++) {
          if (i === opt.page) {
            html.push('<li class="page-number on disabled" data-page="' + i + '"><a href="javascript:void(0);">' +
              i + '</a></li>');
          } else {
            html.push('<li class="page-number" data-page="' + i + '"><a href="javascript:void(0);">' + i +
              '</a></li>');
          }
        }

      }
      if (visible.includes('right')) {
        if (opt.max === opt.pageTotal) {
          html.push('<li class="page-right disabled"><a href="javascript:void(0);">&gt;</a></li>');
        } else {
          html.push('<li class="page-right"><a href="javascript:void(0);">&gt;</a></li>');
        }
      }
      if (visible.includes('next')) {
        if (opt.page === opt.pageTotal) {
          html.push('<li class="page-next disabled"><a href="javascript:void(0);">Next</a></li>');
        } else {
          html.push('<li class="page-next"><a href="javascript:void(0);">Next</a></li>');
        }
      }
      if (visible.includes('end')) {
        if (opt.page === opt.pageTotal) {
          html.push('<li class="page-end disabled"><a href="javascript:void(0);">Last</a></li>');
        } else {
          html.push('<li class="page-end"><a href="javascript:void(0);">Last</a></li>');
        }
      }
      html.push('</ul>');
      element.html(html.join(''));
    }
  };

  $.fn.pagination = function(option) {
    const args = arguments;
    return this.each(function() {
      const self = $(this);
      let data = self.data('pagination');
      if (!data) {
        data = new Pagination(self, option);
        data.init();
        self.data('pagination', data)
      }
      if (typeof option === 'string') {
        data[option].apply(data, Array.prototype.slice.call(args, 1));
      }
    })
  };
})($);
