package spring.entity;

import java.util.Date;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-07-25 11:10
 * Description:
 */
public class UserManger {
    private Date dataValue;

    public Date getDataValue() {
        return dataValue;
    }

    public void setDataValue(Date dataValue) {
        this.dataValue = dataValue;
    }

    @Override
    public String toString() {
        return "UserManger{" +
                "dataValue=" + dataValue +
                '}';
    }
}
