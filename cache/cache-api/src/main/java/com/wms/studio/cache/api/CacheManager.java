package com.wms.studio.cache.api;

/**
 * �������ӿڣ���ȡָ�������µĻ���Cache
 *
 * @author hzwumsh
 *
 */
public interface CacheManager {

	/**
	 * ��ȡָ�����ƵĻ��棬��������治����ʱ�����ᴴ��һ�����沢���ء�
	 *
	 * @param name
	 *            ��Ҫ��ȡ���������
	 * @return ָ�����ƵĻ���
	 */
	public <K, V> Cache<K, V> getCache(String name);
}
