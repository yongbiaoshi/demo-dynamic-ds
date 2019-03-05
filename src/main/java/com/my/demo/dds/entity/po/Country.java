package com.my.demo.dds.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyongbiao
 * @since 2019-03-05
 */
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "country_id", type = IdType.AUTO)
    private Integer countryId;

    private String country;

    private LocalDateTime lastUpdate;


    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Country{" +
        "countryId=" + countryId +
        ", country=" + country +
        ", lastUpdate=" + lastUpdate +
        "}";
    }
}
