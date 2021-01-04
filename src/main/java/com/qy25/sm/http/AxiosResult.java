package com.qy25.sm.http;

import lombok.Data;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:49
 */
@Data
public class AxiosResult<T> {
    private int status;
    private String message;
    private T obj;


    private AxiosResult() {
    }


    /**
     * 私有化构造方法
     * @param axiosStatus
     * @param obj
     * @param <T>
     * @return
     */
    private static <T> AxiosResult<T> getResult(AxiosStatus axiosStatus, T obj) {
        AxiosResult<T> result = new AxiosResult<>();
        result.setObj(obj);
        result.setMessage(axiosStatus.getMessage());
        result.setStatus(axiosStatus.getStatus());
        return result;
    }


    /**
     * 响应成功 返回状态码
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success() {
        return getResult(AxiosStatus.OK, null);
    }

    /**
     * 响应成功 携带数据
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(T obj) {
        AxiosResult<T> result = success();
        result.setObj(obj);
        return result;
    }

    /**
     * 响应成功 返回自定义状态码
     * @param axiosStatus
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus) {
        return getResult(axiosStatus, null);
    }

    /**
     * 响应成功 返回自定义状态码和数据
     * @param axiosStatus
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus, T obj) {
        AxiosResult<T> result = success(axiosStatus);
        result.setObj(obj);
        return result;
    }

    /**
     * 响应失败 返回状态码
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error() {
        return getResult(AxiosStatus.ERROR, null);
    }

    /**
     * 响应失败 携带数据
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(T obj) {
        AxiosResult<T> result = error();
        result.setObj(obj);
        return result;
    }

    /**
     * 响应失败 返回自定义状态码
     * @param axiosStatus
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus) {
        return getResult(axiosStatus, null);
    }

    /**
     * 响应失败 返回自定义状态码和数据
     * @param axiosStatus
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus, T obj) {
        AxiosResult<T> result = error(axiosStatus);
        result.setObj(obj);
        return result;
    }
}
