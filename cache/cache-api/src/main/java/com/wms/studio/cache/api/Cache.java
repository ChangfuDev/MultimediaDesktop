/**
 *
 */
package com.wms.studio.cache.api;

import java.util.Collection;

/**
 * ������Ч�ش洢��ʱ���������һ��Ӧ�õ����� ��ϵͳ����һ������Ľӿڣ�������չ���еĻ����ܣ����� JCache, Ehcache, JCS,
 * OSCache, JBossCache, TerraCotta, Coherence, GigaSpaces�ȡ�
 *
 * @author hzwumsh
 *
 */
public interface Cache<K, V> {

	/**
	 * ��ȡ������ָ��key�µ�ֵ����������ʱ������Ϊ��
	 *
	 * @param key �����û���ʱָ����key
	 * @return ����Ķ������Ϊ��
	 */
	public V get(K key);

	/**
	 * ���һ������ʵ��
	 *
	 * @param key
	 *            ������ʶ���뻺���ʵ��
	 * @param value
	 *            ��Ż�����ʵ���ֵ
	 * @return �������key�£�֮ǰ��ŵ�ʵ�壬��������ʱ�����ؿ�
	 */
	public V put(K key, V value);

	/**
	 * ���һ������ʵ��
	 *
	 * @param key
	 *            ������ʶ���뻺���ʵ��
	 * @param value
	 *            ��Ż�����ʵ���ֵ
	 * @param expire
	 *            ����ʱ��
	 * @return �������key�£�֮ǰ��ŵ�ʵ�壬��������ʱ�����ؿ�
	 */
	public V put(K key, V value, int expire);

	/**
	 * �ӻ����У��Ƴ�ָ��key��ʵ��
	 *
	 * @param key ����ӻ���ʱ���õ�key
	 * @return �������key�£�֮ǰ��ŵ�ʵ�壬��������ʱ�����ؿ�
	 */
	public V remove(K key);

	/**
	 * ��ջ���
	 *
	 */
	public void clear();

	/**
	 * �����ڻ����У����ʵ��ĸ���
	 *
	 * @return �ڻ����У����ʵ��ĸ���
	 */
	public int size();

	/**
	 * �����ڻ����У���ŵ�����ʵ��
	 *
	 * @return �ڻ����У���ŵ�����ʵ��
	 */
	public Collection<V> values();

	/**
	 * ˢ�»���ϵͳ
	 */
	public void flushDB();
}
