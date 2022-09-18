package com.trap2.shop.constants;

public class ShopConstants
{
  public final static byte ACTIVE_SHOP_STATUS = 1;
  public final static byte SUSPENDED_SHOP_STATUS = 0;
  public static final byte SHOP_STATUS_ALL = -1;
  public static final byte CATEGORY_TYPE_ALL = -1;

  public static final String ACTIVE_SHOP_STATUS_STR = "Active";
  public static final String SUSPENDED_SHOP_STATUS_STR = "Suspended";

  public static final String SELECT_COUNT_1 = "SELECT COUNT(1) ";

  public static final String SORT_ACCREDITED_SPECIALIST_DOCTOR_NAME = "AccreditedSpecialist_DoctorName";
  public static final String SORT_ACCREDITED_SPECIALIST_DOCTOR_MCR = "AccreditedSpecialist_DoctorMcr";
  public static final String SORT_ACCREDITED_SPECIALIST_DOCTOR_SPECIALTY = "AccreditedSpecialist_DoctorSpecialty";

  public static final String SORT_AANDEROSTER_SPECIALIST = "createdDate";

  public static final String SORT_MARKETING_LOG_DETAIL_CREADTED_DATE = "createdDate";

  public static final String SORT_ELITE_SCORE = "eliteScore";
  public static final String SORT_TOTAL_SCORE = "totalScore";

  public static final String SOURCE_MARKETING = "MARKETING";
  public static final String SOURCE_O2 = "O2";
  public static final String SOURCE_MDSTAFF = "MDSTAFF";

  public static final String SORT_MARKETING_LOG_DETAIL_CREATED_DATE = "createdDate";

  //SHIELD_PANEL_SPECIALIST TAG//
  public static final String AIA_TAG = "AIA";
  public static final String GE_TAG = "GE";
  public static final String NTUC_TAG = "NTUC";
  public static final String AXA_TAG = "AXA";
  public static final String AVIVA_TAG = "AVIVA";
  public static final String RAFFLES_SHIELD_TAG = "Raffles Shield";
  public static final String TEMPLATE_MDSTAFF_BATCH_JOB_EXPORT_LOG = "/templates/MDStaff_Batch_Job_Export_Log_Template.xlsx";
  public static final String TEMPLATE_NAME_MDSTAFF_BATCH_JOB_EXPORT_LOG = "MDStaff_Batch_Job_Export_Log";
  public static final String SHEET_NAME_MDSTAFF_BATCH_JOB_EXPORT_LOG = "MDStaff_Batch_Job_Export_Log";

  public static final byte MANUAL_CREATE = 0;

  public static final byte MANUAL_UPDATE = 1;
  public static final byte MANUAL_DELETE = 2;
  public static final byte IMPORT_CREATE = 3;
  public static final byte IMPORT_UPDATE = 4;
  public static final byte ACTION_TYPE_ALL = -1;

  public static final String KEY_WORD = "keyword";
  public static final String SORT_DOCTOR_NAME = "doctorName";

  public static final String ACTIVE_DOCTOR_STATUS_STR = "Active";
  public static final String TERMINATED_DOCTOR_STATUS_STR = "Terminated";
  public static final String SUSPENDED_DOCTOR_STATUS_STR = "Suspended";
  public static final byte ACTIVE_DOCTOR_STATUS_VALUE = 1;
  public static final byte TERMINATED_DOCTOR_STATUS_VALUE = 0;
  public static final byte SUSPENDED_DOCTOR_STATUS_VALUE = -1;
  public static final byte ALL_DOCTOR_STATUS_VALUE = 3;
  public static final String MANUAL_UPDATE_STR = "Manual Update";
  public static final String MANUAL_CREATE_STR = "Manual Add";
  public static final String MANUAL_DELETE_STR = "Manual Remove";
  public static final String IMPORT_STR = "Import";

  //The most common ISO Date Time Format yyyy-MM-dd'T'HH:mm:ss.SSSXXX — for example, "2000-10-31T01:30:00.000-05:00"
  public static final String YYYY_MM_DD_HH_MM_SS_Z = "yyyy-MM-dd'T'HH:mm:ssZ";
  public static final String DD_MMM_YY = "dd-MMM-yy";
  public static final String R_TAG = "R";
  public static final String DOCTOR_NOT_EXISTS = "Not exists";

  public static final byte LOG_DETAIL_IMPORT = 5;

  public static final byte LOG_DETAIL_DEFAULT = -1;

  public static final String TEMPLATE_MARKETING_LIST = "/templates/Marketing_Specialist_Template.xlsx";
  public static final String TEMPLATE_NAME = "Marketing_Key_Specialist";
  public static final String SHEET_NAME = "Marketing_Specialist";

  public static final byte VALID = 1;
  public static final byte HOSPITAL_INVALID = 0;
  public static final byte SPECIALTY_INVALID = -1;
  public static final byte DATE_INVALID = -2;

  public static final String TEMPLATE_AANDE_ROSTER_LIST = "/templates/AAndE_Roster_Specialist_Log_Detail_Template.xlsx";
  public static final String TEMPLATE_NAME_AANDE_ROSTER_LIST = "AAndE_Roster_Log_Detail";
  public static final String SHEET_NAME_AANDE_ROSTER_LIST = "AAndE_Roster_Log_Detail";
  public static final String TEMPLATE_IXCHANGE_BATCH_JOB_LIST = "/templates/Ixchange_Batch_Job_Export_Log_Template.xlsx";
  public static final String TEMPLATE_NAME_IXCHANGE_BATCH_LIST = "Ixchange_Batch_Job_Export_Log";
  public static final String SHEET_NAME_IXCHANGE_BATCH_LIST = "Ixchange_Batch_Job_Export_Log";

  public static final String TEMPLATE_IXCHANGE_PANEL_LIST_URL = "/templates/iXchange_Panel_Specialist_Template.xlsx";
  public static final String IXCHANGE_PANEL_TEMPLATE_NAME = "iXchange_Panel_Specialist_List";
  public static final String IXCHANGE_PANEL_SHEET_NAME = "iXchange_Panel_Specialist";
  public static final String SORT_IXCHANGE_PANEL_BY_DOCTOR_NAME = "DOCTOR_NAME";

  public static final String COMMA_CHAR = "; ";

  public static final String TEMPLATE_MASTER_SPECIALIST_LIST_URL = "/templates/IHH_Accredited_Specialist_List_Template.xlsx";
  public static final String MASTER_SPECIALIST_TEMPLATE_NAME = "IHH_Accredited_Specialist_Doctor_List";
  public static final String MASTER_SPECIALIST_SHEET_NAME = "IHH_Accredited_Specialist";
  public static final String MASTER_SPECIALIST_A_AND_E_TAG = "A&E";
}
