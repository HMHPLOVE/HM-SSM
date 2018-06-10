package com.hp.service;

import com.hp.dto.Exposer;
import com.hp.dto.SeckillExecution;
import com.hp.entity.Seckill;
import com.hp.exception.SeckillCloseException;

import java.util.List;

/**
 *
 *
 */
public interface SeckillService {
    /**
     * 查询所有秒杀记录
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 单个秒杀记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     *
     * 秒杀开启输出秒杀接口地址,
     *      * 否则输出系统时间和秒杀时间
     * @param seckillId
     */

    Exposer exportSeckillUrl(long seckillId);

    /**
     *  执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SeckillCloseException,RuntimeException,SeckillCloseException;
    /**
     *执行秒杀操作by 存储过程
     *
     * @param seckillId
     * @param userPhone
     * @param md5
     * @return
     */

    SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5);

}
