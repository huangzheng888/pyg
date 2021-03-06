package com.pinyougou.sellergoods.service;
import java.util.List;
import com.pinyougou.pojo.TbSeller;

import com.pinyougou.entity.PageResult;
import com.pinyougou.entity.Result;
/**
 * 业务逻辑接口
 * @author Steven
 *
 */
public interface SellerService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbSeller> findAll();
	
	
	/**
     * 分页查询列表
     * @return
     */
    public PageResult<TbSeller> findPage(int pageNum, int pageSize,TbSeller seller);
	
	
	/**
	 * 增加
	*/
	public void add(TbSeller seller);
	
	
	/**
	 * 修改
	 */
	public void update(TbSeller seller);
	

	/**
	 * 根据ID获取实体
	 * @param sellerId
	 * @return
	 */
	public TbSeller getById(String sellerId);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long [] ids);

	
}
