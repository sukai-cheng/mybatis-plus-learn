package com.sukai.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chengsukai
 * @since 2022-08-13 14:48
 */
@Slf4j
public class CopyUtil {

    public static <T> List<T> copyList(List source, Class<T> clazz) {
        List<T> target = new ArrayList<>();
        if (!CollectionUtils.isEmpty(source)) {
            for (Object c : source) {
                T obj = copy(c, clazz);
                target.add(obj);
            }
        }
        return target;
    }

    public static <T> T copy(Object source, Class<T> clazz) {
        if (source == null) {
            return null;
        }

        T obj = null;
        try {
            obj = clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            log.error("属性复制错误" + Arrays.toString(e.getStackTrace()));
        }

        if (obj != null) {
            BeanUtils.copyProperties(source, obj);
        }

        return obj;
    }


}
