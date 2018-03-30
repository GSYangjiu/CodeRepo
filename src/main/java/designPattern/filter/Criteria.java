package designPattern.filter;

import java.util.List;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 15:21
 * Description:
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
