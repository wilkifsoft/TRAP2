package com.trap2.shop.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

import java.util.List;

@Setter
@Getter
@Slf4j
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageResponse<T> extends ResponseBase<List<T>> {

    public PageResponse(Page<T> page) {
        this.data = page.getContent();
        this.totalPages = page.getTotalPages();
        this.totalElements = page.getTotalElements();
        this.setResponseMessage(HttpStatus.OK.getReasonPhrase());
        this.setResponseCode(String.valueOf(HttpStatus.OK.value()));
    }

    public PageResponse(int totalPages, long totalElements, List<T> content) {
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.data = content;
        this.setResponseMessage(HttpStatus.OK.getReasonPhrase());
        this.setResponseCode(String.valueOf(HttpStatus.OK.value()));
    }

    private int totalPages;

    private long totalElements;
}
