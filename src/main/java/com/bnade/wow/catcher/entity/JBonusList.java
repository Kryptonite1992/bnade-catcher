package com.bnade.wow.catcher.entity;

import java.util.ArrayList;
import java.util.List;

public class JBonusList implements Comparable<JBonusList> {

	private int bonusListId;

	public int getBonusListId() {
		return bonusListId;
	}

	public void setBonusListId(int bonusListId) {
		this.bonusListId = bonusListId;
	}

	@Override
	public String toString() {
		return "JBonusList [bonusListId=" + bonusListId + "]";
	}

	@Override
	public int compareTo(JBonusList bonus) {
		return this.getBonusListId() - bonus.getBonusListId();
	}
	
	/*
	 * FB出品 567 725 史诗 566 710 英雄级别 565 带插槽 史诗 564 带插槽 英雄级别 563 带插槽 普通 562 战火 史诗
	 * 561 战火 英雄级别 560 战火 普通
	 * 
	 * 制造业 164 某种此属性 531 532 548 549 不知道干啥的 620 705 6阶 武器 619 690 5阶 武器 594 675
	 * 4阶 武器 559 660 3阶 武器 558 645 2阶 武器 525 630 1阶 武器
	 * 
	 * 529 530 531 532 533 534 535 536 537 538 不知道干啥的 618 715 6阶 护甲 617 700 5阶
	 * 护甲 593 685 4阶 护甲 527 670 3阶 护甲 526 655 2阶 护甲 525 640 1阶 护甲
	 */
	public static List<Integer> bonusIds = new ArrayList<Integer>();
	static {
		// 护甲
		bonusIds.add(525);
		bonusIds.add(526);
		bonusIds.add(527);
		bonusIds.add(593);
		bonusIds.add(617);
		bonusIds.add(618);
		// 武器
		bonusIds.add(558);
		bonusIds.add(559);
		bonusIds.add(594);
		bonusIds.add(619);
		bonusIds.add(620);
		// FB
		bonusIds.add(560);
		bonusIds.add(561);
		bonusIds.add(562);
		bonusIds.add(563);
		bonusIds.add(564);
		bonusIds.add(565);
		bonusIds.add(566);
		bonusIds.add(567);
		
		bonusIds.add(1372);	// -100装等
		bonusIds.add(1377);	// -95装等
		bonusIds.add(1382);	// -90装等
		bonusIds.add(1387);	// -85装等
		bonusIds.add(1392);	// -80装等
		bonusIds.add(1397);	// -75装等
		bonusIds.add(1402);	// -70装等
		bonusIds.add(1407);	// -65装等
		bonusIds.add(1412);	// -60装等
		bonusIds.add(1417);	// -55装等
		bonusIds.add(1422);	// -50装等
		bonusIds.add(1427);	// -45装等
		bonusIds.add(1432);	// -40装等
		bonusIds.add(1437);	// -35装等
		bonusIds.add(1442);	// -30装等
		bonusIds.add(1447);	// -25装等
		bonusIds.add(1452);	// -20装等
		bonusIds.add(1457);	// -15装等
		bonusIds.add(1462);	// -10装等
		bonusIds.add(1467);	// -5装等
		bonusIds.add(1472);	// +0装等
		bonusIds.add(1477);	// +5装等
		bonusIds.add(1482);	// +10装等
		bonusIds.add(1487);	// +15装等
		bonusIds.add(1492);	// +20装等
		bonusIds.add(1497);	// +25装等
		bonusIds.add(1502);	// +30装等
		bonusIds.add(1507);	// +35装等
		bonusIds.add(1512);	// +40装等
		bonusIds.add(1517);	// +45装等
		bonusIds.add(1522);	// +50装等
		bonusIds.add(1527);	// +55装等
		bonusIds.add(1532);	// +60装等
		bonusIds.add(1537);	// +65装等
		bonusIds.add(1542);	// +70装等
		bonusIds.add(1547);	// +75装等
		bonusIds.add(1552);	// +80装等
		bonusIds.add(1557);	// +85装等
		bonusIds.add(1562);	// +90装等
		bonusIds.add(1567);	// +95装等
		bonusIds.add(1572);	// +100装等
		bonusIds.add(1577);	// +105装等
		bonusIds.add(1582);	// +110装等
		bonusIds.add(1587);	// +115装等
		bonusIds.add(1592);	// +120装等
		bonusIds.add(1597);	// +125装等
		bonusIds.add(1602);	// +130装等
		bonusIds.add(1607);	// +135装等
		bonusIds.add(1612);	// +140装等
		bonusIds.add(1617);	// +145装等
		bonusIds.add(1622);	// +150装等
		bonusIds.add(1627);	// +155装等
		bonusIds.add(1632);	// +160装等
		bonusIds.add(1637);	// +165装等
		bonusIds.add(1642);	// +170装等
		bonusIds.add(1647);	// +175装等
		bonusIds.add(1652);	// +180装等
		bonusIds.add(1657);	// +185装等
		bonusIds.add(1662);	// +190装等
		bonusIds.add(1667);	// +195装等		
		bonusIds.add(1672);	// +200装等
		
		bonusIds.add(1808);	//棱彩插槽
//		bonusIds.add(40);	//躲闪
//		bonusIds.add(41);	//吸血
//		bonusIds.add(42);	//速度
		bonusIds.add(3398);	//按等级缩放
		
		bonusIds.add(3406); // 谐律之 全能 精通
		bonusIds.add(3405); // 曙光之 全能 急速
		bonusIds.add(3404); // 灼光之 精通 急速
		bonusIds.add(3403); // 燎火之 暴击 急速
		bonusIds.add(3402); // 无双之 暴击 精通
		bonusIds.add(3401); // 快刀之 全能 暴击
		
		// 7.0制造业
		/*
		 * 1676 快刀之 245全能 614暴击
		 * 1677 快刀之 307全能 552暴击
		 * 1678 快刀之 368全能 491暴击
		 * 1679 快刀之 429全能 429暴击
		 * 1680 快刀之 491全能 368暴击
		 * 1681 快刀之 552全能 307暴击
		 * 1682 快刀之 614全能 245暴击
		 * 1683 无双之 614暴击 245精通
		 * 1684 无双之 552暴击 307精通
		 * 1685 无双之 491暴击 368精通
		 * 1686 无双之 429暴击 429精通
		 * 1687 无双之 368暴击 491精通
		 * 1688 无双之 307暴击 552精通
		 * 1689 无双之 245暴击 614精通
		 * 1690 燎火之 614暴击 245急速
		 * 1691 燎火之 552暴击 307急速
		 * 1692 燎火之 491暴击 368急速
		 * 1693 燎火之 429暴击 429急速
		 * 1694 燎火之 368暴击 491急速
		 * 1695 燎火之 307暴击 552急速
		 * 1696 燎火之 245暴击 614急速
		 * 1697 灼光之 245精通 614急速
		 * 1698 灼光之 307精通 552急速
		 * 1699 灼光之 368精通 491急速
		 * 1700 灼光之 429精通 429急速
		 * 1701 灼光之 491精通 368急速
		 * 1702 灼光之 552精通 307急速
		 * 1703 灼光之 614精通 245急速
		 * 1704 曙光之 245全能 614急速
		 * 1705 曙光之 307全能 552急速
		 * 1706 曙光之 368全能 491急速
		 * 1707 曙光之 429全能 429急速
		 * 1708 曙光之 491全能 368急速
		 * 1709 曙光之 552全能 307急速
		 * 1710 曙光之 614全能 245急速
		 * 1711 谐律之 245全能 614精通
		 * 1712 谐律之 307全能 552精通
		 * 1713 谐律之 368全能 491精通
		 * 1714 谐律之 429全能 429精通
		 * 1715 谐律之 491全能 368精通
		 * 1716 谐律之 552全能 307精通
		 * 1717 谐律之 614全能 245精通
		 * 1718 屠夫之 859爆击
		 * 1719 应变之 859全能
		 * 1720 焦躁之 859急速
		 * 1721 专擅之 859精通
		 */
		bonusIds.add(1676);
		bonusIds.add(1677);
		bonusIds.add(1678);
		bonusIds.add(1679);
		bonusIds.add(1680);
		bonusIds.add(1681);
		bonusIds.add(1682);
		bonusIds.add(1683);
		bonusIds.add(1684);
		bonusIds.add(1685);
		bonusIds.add(1686);
		bonusIds.add(1687);
		bonusIds.add(1688);
		bonusIds.add(1689);
		bonusIds.add(1690);
		bonusIds.add(1691);
		bonusIds.add(1692);
		bonusIds.add(1693);
		bonusIds.add(1694);
		bonusIds.add(1695);
		bonusIds.add(1696);
		bonusIds.add(1697);
		bonusIds.add(1698);
		bonusIds.add(1699);
		bonusIds.add(1700);
		bonusIds.add(1701);
		bonusIds.add(1702);
		bonusIds.add(1703);
		bonusIds.add(1704);
		bonusIds.add(1705);
		bonusIds.add(1706);
		bonusIds.add(1707);
		bonusIds.add(1708);
		bonusIds.add(1709);
		bonusIds.add(1710);
		bonusIds.add(1711);
		bonusIds.add(1712);
		bonusIds.add(1713);
		bonusIds.add(1714);
		bonusIds.add(1715);
		bonusIds.add(1716);
		bonusIds.add(1717);
		bonusIds.add(1718);
		bonusIds.add(1719);
		bonusIds.add(1720);
		bonusIds.add(1721);
		// 7.0 项链
		/*
		快刀之 全能 爆击
1742	460全能 1150暴击
1743	552全能 1058暴击
1744	644全能 966暴击
1745	736全能 874暴击
1746	966全能 644暴击
1747	1058全能 552暴击
1748	1150全能 460暴击 
无双之 爆击 精通
1749	1150暴击 460精通
1750	1058暴击 552精通
1751	966暴击 644精通
1752	874暴击 736精通
1753	644暴击 966精通
1754	552暴击 1058精通
1755	460暴击 1150精通 
燎火之 爆击 急速
1756	460急速 1150暴击
1757	598急速 1012暴击
1758	644急速 966暴击
1759	736急速 874暴击
1760	966急速 644暴击
1761	1058急速 552暴击
1762	1150急速 460暴击 
灼光之 精通 急速
1763	1150精通 460急速
1764	1058精通 552急速
1765	966精通 644急速
1766	874精通 736急速
1767	644精通 966急速
1768	552精通 1058急速
1769	460精通 1150急速 
曙光之 全能 急速
1770	460全能 1150急速
1771	552全能 1058急速
1772	644全能 966急速
1773	736全能 874急速
1774	966全能 644急速
1775	1058全能 552急速
1776	1150全能 460急速 
谐律之 全能 精通
1777	460全能 1150精通
1778	552全能 1058精通
1779	644全能 966精通
1780	736全能 874精通
1781	966全能 644精通
1782	1058全能 552精通
1783	1150全能 460精通 
屠夫之 爆击
1784	1611爆击 
应变之 全能
1785	1611全能 
焦躁之 急速
1786	1611急速 
专擅之 精通
1787	1611精通
	 */
		bonusIds.add(1742);
		bonusIds.add(1743);
		bonusIds.add(1744);
		bonusIds.add(1745);
		bonusIds.add(1746);
		bonusIds.add(1747);
		bonusIds.add(1748);
		bonusIds.add(1749);
		bonusIds.add(1750);
		bonusIds.add(1751);
		bonusIds.add(1752);
		bonusIds.add(1753);
		bonusIds.add(1754);
		bonusIds.add(1755);
		bonusIds.add(1756);
		bonusIds.add(1757);
		bonusIds.add(1758);
		bonusIds.add(1759);
		bonusIds.add(1760);
		bonusIds.add(1761);
		bonusIds.add(1762);
		bonusIds.add(1763);
		bonusIds.add(1764);
		bonusIds.add(1765);
		bonusIds.add(1766);
		bonusIds.add(1767);
		bonusIds.add(1768);
		bonusIds.add(1769);
		bonusIds.add(1770);
		bonusIds.add(1771);
		bonusIds.add(1772);
		bonusIds.add(1773);
		bonusIds.add(1774);
		bonusIds.add(1775);
		bonusIds.add(1776);
		bonusIds.add(1777);
		bonusIds.add(1778);
		bonusIds.add(1779);
		bonusIds.add(1780);
		bonusIds.add(1781);
		bonusIds.add(1782);
		bonusIds.add(1783);
		bonusIds.add(1784);
		bonusIds.add(1785);
		bonusIds.add(1786);
		bonusIds.add(1787);
		// 7.0 披风
		
		/*
		3343 快刀之 460全能 229暴击 
		3344 快刀之 575全能 114暴击 
		3345 快刀之 690全能    
		3361 快刀之 229全能 460暴击 
		3362 快刀之 114全能 575暴击 
		3363 快刀之 690暴击    
		3346 无双之 229暴击 460精通 
		3347 无双之 114暴击 575精通 
		3348 无双之 690精通    
		3351 无双之 229精通 460暴击 
		3352 无双之 114精通 575暴击 
		3354 无双之 690暴击    
		3349 燎火之 460急速 229暴击 
		3350 燎火之 575急速 114暴击 
		3353 燎火之 690急速    
		3370 燎火之 229急速 460暴击 
		3371 燎火之 114急速 575暴击 
		3372 燎火之 690暴击    
		3355 灼光之 460急速 229精通 
		3356 灼光之 575急速 114精通 
		3357 灼光之 690急速    
		3373 灼光之 229急速 460精通 
		3374 灼光之 114急速 575精通 
		3375 灼光之 690精通    
		3358 谐律之 460全能 229精通 
		3359 谐律之 575全能 114精通 
		3360 谐律之 690全能    
		3367 谐律之 229全能 460精通 
		3368 谐律之 114全能 575精通 
		3369 谐律之 690精通    
		3364 曙光之 229全能 460急速 
		3365 曙光之 114全能 575急速 
		3366 曙光之 690急速    
		3376 曙光之 460全能 229急速 
		3377 曙光之 575全能 114急速 
		3378 曙光之 690全能 
		 */
		bonusIds.add(3343);
		bonusIds.add(3344);
		bonusIds.add(3345);
		bonusIds.add(3346);
		bonusIds.add(3347);
		bonusIds.add(3348);
		bonusIds.add(3349);
		bonusIds.add(3350);
		bonusIds.add(3351);
		bonusIds.add(3352);
		bonusIds.add(3353);
		bonusIds.add(3354);
		bonusIds.add(3355);
		bonusIds.add(3356);
		bonusIds.add(3357);
		bonusIds.add(3358);
		bonusIds.add(3359);
		bonusIds.add(3360);
		bonusIds.add(3361);
		bonusIds.add(3362);
		bonusIds.add(3363);
		bonusIds.add(3364);
		bonusIds.add(3365);
		bonusIds.add(3366);
		bonusIds.add(3367);
		bonusIds.add(3368);
		bonusIds.add(3369);
		bonusIds.add(3370);
		bonusIds.add(3371);
		bonusIds.add(3372);
		bonusIds.add(3373);
		bonusIds.add(3374);
		bonusIds.add(3375);
		bonusIds.add(3376);
		bonusIds.add(3377);
		bonusIds.add(3378);
	}
}
