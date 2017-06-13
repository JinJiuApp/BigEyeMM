package dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
// KEEP INCLUDES END

/**
 * Entity mapped to table ad_city.
 */
public class AdModel {

    private Long id;
    private Integer cityId;
    private Integer displayMode;
    private Integer displayTime;
    private String imageUrl;
    private String startTime;
    private String endTime;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public AdModel() {
    }

    public AdModel(Long id) {
        this.id = id;
    }

    public AdModel(Long id, Integer cityId, Integer displayMode, Integer displayTime, String imageUrl, String startTime, String endTime) {
        this.id = id;
        this.cityId = cityId;
        this.displayMode = displayMode;
        this.displayTime = displayTime;
        this.imageUrl = imageUrl;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(Integer displayMode) {
        this.displayMode = displayMode;
    }

    public Integer getDisplayTime() {
        return displayTime;
    }

    public void setDisplayTime(Integer displayTime) {
        this.displayTime = displayTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    // KEEP METHODS - put your custom methods here

    /***
     * 当前广告是否具有时效性
     *
     * @return true 有时效
     */
    public boolean isAdTimeLiness() {
        boolean result = false;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date startDate = null;
        Date endDate = null;
        Date curDate = new Date(System.currentTimeMillis());//获取当前时间
        try {
            startDate = (Date) df.parseObject(getStartTime());
            endDate = (Date) df.parseObject(getEndTime());
        } catch (ParseException e) {
            //异常说明空，不做判断
        }
        if ((startDate != null && startDate.getTime() <= curDate.getTime()) &&
                (endDate != null && endDate.getTime() > curDate.getTime())) {
            result = true;
        }
        return result;
    }
    // KEEP METHODS END

}