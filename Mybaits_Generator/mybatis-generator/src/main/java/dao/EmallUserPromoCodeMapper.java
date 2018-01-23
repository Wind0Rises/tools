package dao;

import java.util.List;
import model.liu.EmallUserPromoCode;

public interface EmallUserPromoCodeMapper {
    int deleteByPrimaryKey(String userPromoCode);

    int insert(EmallUserPromoCode record);

    EmallUserPromoCode selectByPrimaryKey(String userPromoCode);

    List<EmallUserPromoCode> selectAll();

    int updateByPrimaryKey(EmallUserPromoCode record);
}