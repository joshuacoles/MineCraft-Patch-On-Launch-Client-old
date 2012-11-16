import java.util.List;
import java.util.Random;

public class C_100992_tt {

   private C_101040_sq field_110837_a = null;
   protected static Random field_110833_d = new Random();
   public static C_100992_tt[] field_110834_e = new C_100992_tt[32000];
   public static C_100992_tt field_110831_f = (new C_100978_un(0, C_100991_tu.field_111330_c)).func_110795_b(2, 5).func_110761_b("shovelIron");
   public static C_100992_tt field_110832_g = (new C_101000_uc(1, C_100991_tu.field_111330_c)).func_110795_b(2, 6).func_110761_b("pickaxeIron");
   public static C_100992_tt field_110844_h = (new C_101011_tr(2, C_100991_tu.field_111330_c)).func_110795_b(2, 7).func_110761_b("hatchetIron");
   public static C_100992_tt field_110845_i = (new C_101007_tn(3)).func_110795_b(5, 0).func_110761_b("flintAndSteel");
   public static C_100992_tt field_110842_j = (new C_101006_to(4, 4, 0.3F, false)).func_110795_b(10, 0).func_110761_b("apple");
   public static C_100992_tt field_110843_k = (new C_101047_si(5)).func_110795_b(5, 1).func_110761_b("bow");
   public static C_100992_tt field_110840_l = (new C_100992_tt(6)).func_110795_b(5, 2).func_110761_b("arrow").func_110802_a(C_101040_sq.field_111424_j);
   public static C_100992_tt field_110841_m = (new C_101035_sn(7)).func_110795_b(7, 0).func_110761_b("coal");
   public static C_100992_tt field_110838_n = (new C_100992_tt(8)).func_110795_b(7, 3).func_110761_b("diamond").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110839_o = (new C_100992_tt(9)).func_110795_b(7, 1).func_110761_b("ingotIron").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110853_p = (new C_100992_tt(10)).func_110795_b(7, 2).func_110761_b("ingotGold").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110852_q = (new C_100939_uy(11, C_100991_tu.field_111330_c)).func_110795_b(2, 4).func_110761_b("swordIron");
   public static C_100992_tt field_110851_r = (new C_100939_uy(12, C_100991_tu.field_111331_a)).func_110795_b(0, 4).func_110761_b("swordWood");
   public static C_100992_tt field_110850_s = (new C_100978_un(13, C_100991_tu.field_111331_a)).func_110795_b(0, 5).func_110761_b("shovelWood");
   public static C_100992_tt field_110849_t = (new C_101000_uc(14, C_100991_tu.field_111331_a)).func_110795_b(0, 6).func_110761_b("pickaxeWood");
   public static C_100992_tt field_110848_u = (new C_101011_tr(15, C_100991_tu.field_111331_a)).func_110795_b(0, 7).func_110761_b("hatchetWood");
   public static C_100992_tt field_110847_v = (new C_100939_uy(16, C_100991_tu.field_111329_b)).func_110795_b(1, 4).func_110761_b("swordStone");
   public static C_100992_tt field_110846_w = (new C_100978_un(17, C_100991_tu.field_111329_b)).func_110795_b(1, 5).func_110761_b("shovelStone");
   public static C_100992_tt field_110856_x = (new C_101000_uc(18, C_100991_tu.field_111329_b)).func_110795_b(1, 6).func_110761_b("pickaxeStone");
   public static C_100992_tt field_110855_y = (new C_101011_tr(19, C_100991_tu.field_111329_b)).func_110795_b(1, 7).func_110761_b("hatchetStone");
   public static C_100992_tt field_110854_z = (new C_100939_uy(20, C_100991_tu.field_111327_d)).func_110795_b(3, 4).func_110761_b("swordDiamond");
   public static C_100992_tt field_110809_A = (new C_100978_un(21, C_100991_tu.field_111327_d)).func_110795_b(3, 5).func_110761_b("shovelDiamond");
   public static C_100992_tt field_110810_B = (new C_101000_uc(22, C_100991_tu.field_111327_d)).func_110795_b(3, 6).func_110761_b("pickaxeDiamond");
   public static C_100992_tt field_110811_C = (new C_101011_tr(23, C_100991_tu.field_111327_d)).func_110795_b(3, 7).func_110761_b("hatchetDiamond");
   public static C_100992_tt field_110805_D = (new C_100992_tt(24)).func_110795_b(5, 3).func_110781_o().func_110761_b("stick").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110806_E = (new C_100992_tt(25)).func_110795_b(7, 4).func_110761_b("bowl").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110807_F = (new C_101046_sj(26, 6)).func_110795_b(8, 4).func_110761_b("mushroomStew");
   public static C_100992_tt field_110808_G = (new C_100939_uy(27, C_100991_tu.field_111328_e)).func_110795_b(4, 4).func_110761_b("swordGold");
   public static C_100992_tt field_110816_H = (new C_100978_un(28, C_100991_tu.field_111328_e)).func_110795_b(4, 5).func_110761_b("shovelGold");
   public static C_100992_tt field_110817_I = (new C_101000_uc(29, C_100991_tu.field_111328_e)).func_110795_b(4, 6).func_110761_b("pickaxeGold");
   public static C_100992_tt field_110818_J = (new C_101011_tr(30, C_100991_tu.field_111328_e)).func_110795_b(4, 7).func_110761_b("hatchetGold");
   public static C_100992_tt field_110819_K = (new C_100944_uv(31, C_100451_alf.field_106217_bX)).func_110795_b(8, 0).func_110761_b("string").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110812_L = (new C_100992_tt(32)).func_110795_b(8, 1).func_110761_b("feather").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110813_M = (new C_100992_tt(33)).func_110795_b(8, 2).func_110761_b("sulphur").func_110785_c(C_100947_vb.field_111131_k).func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110814_N = (new C_101010_ts(34, C_100991_tu.field_111331_a)).func_110795_b(0, 8).func_110761_b("hoeWood");
   public static C_100992_tt field_110815_O = (new C_101010_ts(35, C_100991_tu.field_111329_b)).func_110795_b(1, 8).func_110761_b("hoeStone");
   public static C_100992_tt field_110825_P = (new C_101010_ts(36, C_100991_tu.field_111330_c)).func_110795_b(2, 8).func_110761_b("hoeIron");
   public static C_100992_tt field_110824_Q = (new C_101010_ts(37, C_100991_tu.field_111327_d)).func_110795_b(3, 8).func_110761_b("hoeDiamond");
   public static C_100992_tt field_110827_R = (new C_101010_ts(38, C_100991_tu.field_111328_e)).func_110795_b(4, 8).func_110761_b("hoeGold");
   public static C_100992_tt field_110826_S = (new C_100959_ul(39, C_100451_alf.field_106195_aC.field_106162_cm, C_100451_alf.field_106196_aD.field_106162_cm)).func_110795_b(9, 0).func_110761_b("seeds");
   public static C_100992_tt field_110821_T = (new C_100992_tt(40)).func_110795_b(9, 1).func_110761_b("wheat").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110820_U = (new C_101006_to(41, 5, 0.6F, false)).func_110795_b(9, 2).func_110761_b("bread");
   public static C_100992_tt field_110823_V = (new C_101042_sc(42, C_101041_sd.field_111442_a, 0, 0)).func_110795_b(0, 0).func_110761_b("helmetCloth");
   public static C_100992_tt field_110822_W = (new C_101042_sc(43, C_101041_sd.field_111442_a, 0, 1)).func_110795_b(0, 1).func_110761_b("chestplateCloth");
   public static C_100992_tt field_110829_X = (new C_101042_sc(44, C_101041_sd.field_111442_a, 0, 2)).func_110795_b(0, 2).func_110761_b("leggingsCloth");
   public static C_100992_tt field_110828_Y = (new C_101042_sc(45, C_101041_sd.field_111442_a, 0, 3)).func_110795_b(0, 3).func_110761_b("bootsCloth");
   public static C_100992_tt field_110830_Z = (new C_101042_sc(46, C_101041_sd.field_111440_b, 1, 0)).func_110795_b(1, 0).func_110761_b("helmetChain");
   public static C_100992_tt field_110962_aa = (new C_101042_sc(47, C_101041_sd.field_111440_b, 1, 1)).func_110795_b(1, 1).func_110761_b("chestplateChain");
   public static C_100992_tt field_110964_ab = (new C_101042_sc(48, C_101041_sd.field_111440_b, 1, 2)).func_110795_b(1, 2).func_110761_b("leggingsChain");
   public static C_100992_tt field_110958_ac = (new C_101042_sc(49, C_101041_sd.field_111440_b, 1, 3)).func_110795_b(1, 3).func_110761_b("bootsChain");
   public static C_100992_tt field_110960_ad = (new C_101042_sc(50, C_101041_sd.field_111441_c, 2, 0)).func_110795_b(2, 0).func_110761_b("helmetIron");
   public static C_100992_tt field_110970_ae = (new C_101042_sc(51, C_101041_sd.field_111441_c, 2, 1)).func_110795_b(2, 1).func_110761_b("chestplateIron");
   public static C_100992_tt field_110972_af = (new C_101042_sc(52, C_101041_sd.field_111441_c, 2, 2)).func_110795_b(2, 2).func_110761_b("leggingsIron");
   public static C_100992_tt field_110966_ag = (new C_101042_sc(53, C_101041_sd.field_111441_c, 2, 3)).func_110795_b(2, 3).func_110761_b("bootsIron");
   public static C_100992_tt field_110968_ah = (new C_101042_sc(54, C_101041_sd.field_111439_e, 3, 0)).func_110795_b(3, 0).func_110761_b("helmetDiamond");
   public static C_100992_tt field_110946_ai = (new C_101042_sc(55, C_101041_sd.field_111439_e, 3, 1)).func_110795_b(3, 1).func_110761_b("chestplateDiamond");
   public static C_100992_tt field_110948_aj = (new C_101042_sc(56, C_101041_sd.field_111439_e, 3, 2)).func_110795_b(3, 2).func_110761_b("leggingsDiamond");
   public static C_100992_tt field_110942_ak = (new C_101042_sc(57, C_101041_sd.field_111439_e, 3, 3)).func_110795_b(3, 3).func_110761_b("bootsDiamond");
   public static C_100992_tt field_110944_al = (new C_101042_sc(58, C_101041_sd.field_111438_d, 4, 0)).func_110795_b(4, 0).func_110761_b("helmetGold");
   public static C_100992_tt field_110954_am = (new C_101042_sc(59, C_101041_sd.field_111438_d, 4, 1)).func_110795_b(4, 1).func_110761_b("chestplateGold");
   public static C_100992_tt field_110956_an = (new C_101042_sc(60, C_101041_sd.field_111438_d, 4, 2)).func_110795_b(4, 2).func_110761_b("leggingsGold");
   public static C_100992_tt field_110950_ao = (new C_101042_sc(61, C_101041_sd.field_111438_d, 4, 3)).func_110795_b(4, 3).func_110761_b("bootsGold");
   public static C_100992_tt field_110952_ap = (new C_100992_tt(62)).func_110795_b(6, 0).func_110761_b("flint").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110932_aq = (new C_101006_to(63, 3, 0.3F, true)).func_110795_b(7, 5).func_110761_b("porkchopRaw");
   public static C_100992_tt field_110930_ar = (new C_101006_to(64, 8, 0.8F, true)).func_110795_b(8, 5).func_110761_b("porkchopCooked");
   public static C_100992_tt field_110928_as = (new C_101012_tq(65, C_100600_lq.class)).func_110795_b(10, 1).func_110761_b("painting");
   public static C_100992_tt field_110926_at = (new C_101013_tp(66, 4, 1.2F, false)).func_111005_j().func_111006_a(C_100690_kw.field_109172_l.field_109159_H, 5, 0, 1.0F).func_110795_b(11, 0).func_110761_b("appleGold");
   public static C_100992_tt field_110940_au = (new C_100980_uo(67)).func_110795_b(10, 2).func_110761_b("sign");
   public static C_100992_tt field_110938_av = (new C_101016_te(68, C_100664_afg.field_109008_d)).func_110795_b(11, 2).func_110761_b("doorWood");
   public static C_100992_tt field_110936_aw = (new C_101034_sk(69, 0)).func_110795_b(10, 4).func_110761_b("bucket").func_110753_d(16);
   public static C_100992_tt field_110934_ax = (new C_101034_sk(70, C_100451_alf.field_106071_D.field_106162_cm)).func_110795_b(11, 4).func_110761_b("bucketWater").func_110770_a(field_110936_aw);
   public static C_100992_tt field_110923_ay = (new C_101034_sk(71, C_100451_alf.field_106073_F.field_106162_cm)).func_110795_b(12, 4).func_110761_b("bucketLava").func_110770_a(field_110936_aw);
   public static C_100992_tt field_110921_az = (new C_100989_tz(72, 0)).func_110795_b(7, 8).func_110761_b("minecart");
   public static C_100992_tt field_110913_aA = (new C_100954_ui(73)).func_110795_b(8, 6).func_110761_b("saddle");
   public static C_100992_tt field_110914_aB = (new C_101016_te(74, C_100664_afg.field_109006_f)).func_110795_b(12, 2).func_110761_b("doorIron");
   public static C_100992_tt field_110915_aC = (new C_100967_uh(75)).func_110795_b(8, 3).func_110761_b("redstone").func_110785_c(C_100947_vb.field_111133_i);
   public static C_100992_tt field_110916_aD = (new C_100971_ur(76)).func_110795_b(14, 0).func_110761_b("snowball");
   public static C_100992_tt field_110917_aE = (new C_101045_sg(77)).func_110795_b(8, 8).func_110761_b("boat");
   public static C_100992_tt field_110918_aF = (new C_100992_tt(78)).func_110795_b(7, 6).func_110761_b("leather").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110919_aG = (new C_100984_ty(79)).func_110795_b(13, 4).func_110761_b("milk").func_110770_a(field_110936_aw);
   public static C_100992_tt field_110920_aH = (new C_100992_tt(80)).func_110795_b(6, 1).func_110761_b("brick").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110905_aI = (new C_100992_tt(81)).func_110795_b(9, 3).func_110761_b("clay").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110906_aJ = (new C_100944_uv(82, C_100451_alf.field_106205_ba)).func_110795_b(11, 1).func_110761_b("reeds").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110907_aK = (new C_100992_tt(83)).func_110795_b(10, 3).func_110761_b("paper").func_110802_a(C_101040_sq.field_111413_f);
   public static C_100992_tt field_110908_aL = (new C_100992_tt(84)).func_110795_b(11, 3).func_110761_b("book").func_110802_a(C_101040_sq.field_111413_f);
   public static C_100992_tt field_110909_aM = (new C_100992_tt(85)).func_110795_b(14, 1).func_110761_b("slimeball").func_110802_a(C_101040_sq.field_111413_f);
   public static C_100992_tt field_110910_aN = (new C_100989_tz(86, 1)).func_110795_b(7, 9).func_110761_b("minecartChest");
   public static C_100992_tt field_110911_aO = (new C_100989_tz(87, 2)).func_110795_b(7, 10).func_110761_b("minecartFurnace");
   public static C_100992_tt field_110912_aP = (new C_101014_tg(88)).func_110795_b(12, 0).func_110761_b("egg");
   public static C_100992_tt field_110898_aQ = (new C_100992_tt(89)).func_110795_b(6, 3).func_110761_b("compass").func_110802_a(C_101040_sq.field_111427_i);
   public static C_100992_tt field_110897_aR = (new C_101008_tm(90)).func_110795_b(5, 4).func_110761_b("fishingRod");
   public static C_100992_tt field_110900_aS = (new C_100992_tt(91)).func_110795_b(6, 4).func_110761_b("clock").func_110802_a(C_101040_sq.field_111427_i);
   public static C_100992_tt field_110899_aT = (new C_100992_tt(92)).func_110795_b(9, 4).func_110761_b("yellowDust").func_110785_c(C_100947_vb.field_111130_j).func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110902_aU = (new C_101006_to(93, 2, 0.3F, false)).func_110795_b(9, 5).func_110761_b("fishRaw");
   public static C_100992_tt field_110901_aV = (new C_101006_to(94, 5, 0.6F, false)).func_110795_b(10, 5).func_110761_b("fishCooked");
   public static C_100992_tt field_110904_aW = (new C_101015_tf(95)).func_110795_b(14, 4).func_110761_b("dyePowder");
   public static C_100992_tt field_110903_aX = (new C_100992_tt(96)).func_110795_b(12, 1).func_110761_b("bone").func_110781_o().func_110802_a(C_101040_sq.field_111413_f);
   public static C_100992_tt field_110895_aY = (new C_100992_tt(97)).func_110795_b(13, 0).func_110761_b("sugar").func_110785_c(C_100947_vb.field_111123_b).func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110894_aZ = (new C_100944_uv(98, C_100451_alf.field_106137_bj)).func_110753_d(1).func_110795_b(13, 1).func_110761_b("cake").func_110802_a(C_101040_sq.field_111426_h);
   public static C_100992_tt field_110924_ba = (new C_101043_sf(99)).func_110753_d(1).func_110795_b(13, 2).func_110761_b("bed");
   public static C_100992_tt field_110880_bb = (new C_100944_uv(100, C_100451_alf.field_106138_bk)).func_110795_b(6, 5).func_110761_b("diode").func_110802_a(C_101040_sq.field_111415_d);
   public static C_100992_tt field_110881_bc = (new C_101006_to(101, 2, 0.1F, false)).func_110795_b(12, 5).func_110761_b("cookie");
   public static C_100986_tx field_110882_bd = (C_100986_tx)(new C_100986_tx(102)).func_110795_b(12, 3).func_110761_b("map");
   public static C_100976_um field_110883_be = (C_100976_um)(new C_100976_um(103)).func_110795_b(13, 5).func_110761_b("shears");
   public static C_100992_tt field_110876_bf = (new C_101006_to(104, 2, 0.3F, false)).func_110795_b(13, 6).func_110761_b("melon");
   public static C_100992_tt field_110877_bg = (new C_100959_ul(105, C_100451_alf.field_106126_bv.field_106162_cm, C_100451_alf.field_106196_aD.field_106162_cm)).func_110795_b(13, 3).func_110761_b("seeds_pumpkin");
   public static C_100992_tt field_110878_bh = (new C_100959_ul(106, C_100451_alf.field_106125_bw.field_106162_cm, C_100451_alf.field_106196_aD.field_106162_cm)).func_110795_b(14, 3).func_110761_b("seeds_melon");
   public static C_100992_tt field_110879_bi = (new C_101006_to(107, 3, 0.3F, true)).func_110795_b(9, 6).func_110761_b("beefRaw");
   public static C_100992_tt field_110872_bj = (new C_101006_to(108, 8, 0.8F, true)).func_110795_b(10, 6).func_110761_b("beefCooked");
   public static C_100992_tt field_110873_bk = (new C_101006_to(109, 2, 0.3F, true)).func_111006_a(C_100690_kw.field_109182_s.field_109159_H, 30, 0, 0.3F).func_110795_b(9, 7).func_110761_b("chickenRaw");
   public static C_100992_tt field_110874_bl = (new C_101006_to(110, 6, 0.6F, true)).func_110795_b(10, 7).func_110761_b("chickenCooked");
   public static C_100992_tt field_110875_bm = (new C_101006_to(111, 4, 0.1F, true)).func_111006_a(C_100690_kw.field_109182_s.field_109159_H, 30, 0, 0.8F).func_110795_b(11, 5).func_110761_b("rottenFlesh");
   public static C_100992_tt field_110868_bn = (new C_101019_tj(112)).func_110795_b(11, 6).func_110761_b("enderPearl");
   public static C_100992_tt field_110869_bo = (new C_100992_tt(113)).func_110795_b(12, 6).func_110761_b("blazeRod").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110870_bp = (new C_100992_tt(114)).func_110795_b(11, 7).func_110761_b("ghastTear").func_110785_c(C_100947_vb.field_111124_c).func_110802_a(C_101040_sq.field_111425_k);
   public static C_100992_tt field_110871_bq = (new C_100992_tt(115)).func_110795_b(12, 7).func_110761_b("goldNugget").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110865_br = (new C_100959_ul(116, C_100451_alf.field_106253_bG.field_106162_cm, C_100451_alf.field_106141_bf.field_106162_cm)).func_110795_b(13, 7).func_110761_b("netherStalkSeeds").func_110785_c("+4");
   public static C_100961_ue field_110864_bs = (C_100961_ue)(new C_100961_ue(117)).func_110795_b(13, 8).func_110761_b("potion");
   public static C_100992_tt field_110867_bt = (new C_101044_sh(118)).func_110795_b(12, 8).func_110761_b("glassBottle");
   public static C_100992_tt field_110866_bu = (new C_101006_to(119, 2, 0.8F, false)).func_111006_a(C_100690_kw.field_109180_u.field_109159_H, 5, 0, 1.0F).func_110795_b(11, 8).func_110761_b("spiderEye").func_110785_c(C_100947_vb.field_111121_d);
   public static C_100992_tt field_110861_bv = (new C_100992_tt(120)).func_110795_b(10, 8).func_110761_b("fermentedSpiderEye").func_110785_c(C_100947_vb.field_111122_e).func_110802_a(C_101040_sq.field_111425_k);
   public static C_100992_tt field_110860_bw = (new C_100992_tt(121)).func_110795_b(13, 9).func_110761_b("blazePowder").func_110785_c(C_100947_vb.field_111120_g).func_110802_a(C_101040_sq.field_111425_k);
   public static C_100992_tt field_110863_bx = (new C_100992_tt(122)).func_110795_b(13, 10).func_110761_b("magmaCream").func_110785_c(C_100947_vb.field_111132_h).func_110802_a(C_101040_sq.field_111425_k);
   public static C_100992_tt field_110862_by = (new C_100944_uv(123, C_100451_alf.field_106249_bI)).func_110795_b(12, 10).func_110761_b("brewingStand").func_110802_a(C_101040_sq.field_111425_k);
   public static C_100992_tt field_110859_bz = (new C_100944_uv(124, C_100451_alf.field_106227_bJ)).func_110795_b(12, 9).func_110761_b("cauldron").func_110802_a(C_101040_sq.field_111425_k);
   public static C_100992_tt field_110896_bA = (new C_101020_ti(125)).func_110795_b(11, 9).func_110761_b("eyeOfEnder");
   public static C_100992_tt field_110961_bB = (new C_100992_tt(126)).func_110795_b(9, 8).func_110761_b("speckledMelon").func_110785_c(C_100947_vb.field_111119_f).func_110802_a(C_101040_sq.field_111425_k);
   public static C_100992_tt field_110963_bC = (new C_100997_ua(127)).func_110795_b(9, 9).func_110761_b("monsterPlacer");
   public static C_100992_tt field_110957_bD = (new C_101018_tk(128)).func_110795_b(11, 10).func_110761_b("expBottle");
   public static C_100992_tt field_110959_bE = (new C_101009_tl(129)).func_110795_b(14, 2).func_110761_b("fireball");
   public static C_100992_tt field_110969_bF = (new C_100937_uz(130)).func_110795_b(11, 11).func_110761_b("writingBook").func_110802_a(C_101040_sq.field_111413_f);
   public static C_100992_tt field_110971_bG = (new C_100949_va(131)).func_110795_b(12, 11).func_110761_b("writtenBook");
   public static C_100992_tt field_110965_bH = (new C_100992_tt(132)).func_110795_b(10, 11).func_110761_b("emerald").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110967_bI = (new C_101012_tq(133, C_100596_lm.class)).func_110795_b(14, 12).func_110761_b("frame");
   public static C_100992_tt field_110945_bJ = (new C_100944_uv(134, C_100451_alf.field_106171_cf)).func_110795_b(13, 11).func_110761_b("flowerPot").func_110802_a(C_101040_sq.field_111418_c);
   public static C_100992_tt field_110947_bK = (new C_100957_uk(135, 4, 0.6F, C_100451_alf.field_106168_cg.field_106162_cm, C_100451_alf.field_106196_aD.field_106162_cm)).func_110795_b(8, 7).func_110761_b("carrots");
   public static C_100992_tt field_110941_bL = (new C_100957_uk(136, 1, 0.3F, C_100451_alf.field_106169_ch.field_106162_cm, C_100451_alf.field_106196_aD.field_106162_cm)).func_110795_b(7, 7).func_110761_b("potato");
   public static C_100992_tt field_110943_bM = (new C_101006_to(137, 6, 0.6F, false)).func_110795_b(6, 7).func_110761_b("potatoBaked");
   public static C_100992_tt field_110953_bN = (new C_101006_to(138, 2, 0.3F, false)).func_111006_a(C_100690_kw.field_109180_u.field_109159_H, 5, 0, 0.6F).func_110795_b(6, 8).func_110761_b("potatoPoisonous");
   public static C_101021_th field_110955_bO = (C_101021_th)(new C_101021_th(139)).func_110795_b(13, 12).func_110761_b("emptyMap");
   public static C_100992_tt field_110949_bP = (new C_101006_to(140, 6, 1.2F, false)).func_110795_b(6, 9).func_110761_b("carrotGolden").func_110785_c(C_100947_vb.field_111128_l);
   public static C_100992_tt field_110951_bQ = (new C_100969_uq(141)).func_110761_b("skull");
   public static C_100992_tt field_110931_bR = (new C_101033_sl(142)).func_110795_b(6, 6).func_110761_b("carrotOnAStick");
   public static C_100992_tt field_110929_bS = (new C_100982_up(143)).func_110795_b(9, 11).func_110761_b("netherStar").func_110802_a(C_101040_sq.field_111422_l);
   public static C_100992_tt field_110927_bT = (new C_101006_to(144, 8, 0.3F, false)).func_110795_b(8, 9).func_110761_b("pumpkinPie").func_110802_a(C_101040_sq.field_111426_h);
   public static C_100992_tt field_110925_bU = (new C_100965_ug(2000, "13")).func_110795_b(0, 15).func_110761_b("record");
   public static C_100992_tt field_110939_bV = (new C_100965_ug(2001, "cat")).func_110795_b(1, 15).func_110761_b("record");
   public static C_100992_tt field_110937_bW = (new C_100965_ug(2002, "blocks")).func_110795_b(2, 15).func_110761_b("record");
   public static C_100992_tt field_110935_bX = (new C_100965_ug(2003, "chirp")).func_110795_b(3, 15).func_110761_b("record");
   public static C_100992_tt field_110933_bY = (new C_100965_ug(2004, "far")).func_110795_b(4, 15).func_110761_b("record");
   public static C_100992_tt field_110922_bZ = (new C_100965_ug(2005, "mall")).func_110795_b(5, 15).func_110761_b("record");
   public static C_100992_tt field_110858_ca = (new C_100965_ug(2006, "mellohi")).func_110795_b(6, 15).func_110761_b("record");
   public static C_100992_tt field_110857_cb = (new C_100965_ug(2007, "stal")).func_110795_b(7, 15).func_110761_b("record");
   public static C_100992_tt field_110892_cc = (new C_100965_ug(2008, "strad")).func_110795_b(8, 15).func_110761_b("record");
   public static C_100992_tt field_110893_cd = (new C_100965_ug(2009, "ward")).func_110795_b(9, 15).func_110761_b("record");
   public static C_100992_tt field_110890_ce = (new C_100965_ug(2010, "11")).func_110795_b(10, 15).func_110761_b("record");
   public final int field_110891_cf;
   protected int field_110888_cg = 64;
   private int field_110835_b = 0;
   protected int field_110889_ch;
   protected boolean field_110886_ci = false;
   protected boolean field_110887_cj = false;
   private C_100992_tt field_110836_c = null;
   private String field_110884_ck = null;
   private String field_110885_cl;


   protected C_100992_tt(int var1) {
      this.field_110891_cf = 256 + var1;
      if(field_110834_e[256 + var1] != null) {
         System.out.println("CONFLICT @ " + var1);
      }

      field_110834_e[256 + var1] = this;
   }

   public C_100992_tt func_110772_c(int var1) {
      this.field_110889_ch = var1;
      return this;
   }

   public C_100992_tt func_110753_d(int var1) {
      this.field_110888_cg = var1;
      return this;
   }

   public C_100992_tt func_110795_b(int var1, int var2) {
      this.field_110889_ch = var1 + var2 * 16;
      return this;
   }

   public int func_110787_b(int var1) {
      return this.field_110889_ch;
   }

   public final int func_110755_f(C_100994_tv var1) {
      return this.func_110787_b(var1.func_111367_j());
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      return false;
   }

   public float func_110783_a(C_100994_tv var1, C_100451_alf var2) {
      return 1.0F;
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      return var1;
   }

   public C_100994_tv func_110792_b(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      return var1;
   }

   public int func_110771_k() {
      return this.field_110888_cg;
   }

   public int func_110748_a(int var1) {
      return 0;
   }

   public boolean func_110803_l() {
      return this.field_110887_cj;
   }

   protected C_100992_tt func_110800_a(boolean var1) {
      this.field_110887_cj = var1;
      return this;
   }

   public int func_110801_m() {
      return this.field_110835_b;
   }

   protected C_100992_tt func_110804_e(int var1) {
      this.field_110835_b = var1;
      return this;
   }

   public boolean func_110765_n() {
      return this.field_110835_b > 0 && !this.field_110887_cj;
   }

   public boolean func_110779_a(C_100994_tv var1, C_100595_ln var2, C_100595_ln var3) {
      return false;
   }

   public boolean func_110757_a(C_100994_tv var1, C_100873_xe var2, int var3, int var4, int var5, int var6, C_100595_ln var7) {
      return false;
   }

   public int func_110756_a(C_100730_lb var1) {
      return 1;
   }

   public boolean func_110766_a(C_100451_alf var1) {
      return false;
   }

   public boolean func_110798_a(C_100994_tv var1, C_100595_ln var2) {
      return false;
   }

   public C_100992_tt func_110781_o() {
      this.field_110886_ci = true;
      return this;
   }

   public boolean func_110763_n_() {
      return this.field_110886_ci;
   }

   public boolean func_110797_o_() {
      return false;
   }

   public C_100992_tt func_110761_b(String var1) {
      this.field_110885_cl = "item." + var1;
      return this;
   }

   public String func_110782_g(C_100994_tv var1) {
      String var2 = this.func_110791_c_(var1);
      return var2 == null?"":C_100359_bd.func_107638_a(var2);
   }

   public String func_110793_a() {
      return this.field_110885_cl;
   }

   public String func_110791_c_(C_100994_tv var1) {
      return this.field_110885_cl;
   }

   public C_100992_tt func_110770_a(C_100992_tt var1) {
      this.field_110836_c = var1;
      return this;
   }

   public boolean func_110759_h(C_100994_tv var1) {
      return true;
   }

   public boolean func_110746_q() {
      return true;
   }

   public C_100992_tt func_110789_r() {
      return this.field_110836_c;
   }

   public boolean func_110776_s() {
      return this.field_110836_c != null;
   }

   public String func_110799_t() {
      return C_100359_bd.func_107638_a(this.func_110793_a() + ".name");
   }

   public String func_110788_i(C_100994_tv var1) {
      return C_100359_bd.func_107638_a(this.func_110791_c_(var1) + ".name");
   }

   public int func_110774_a(C_100994_tv var1, int var2) {
      return 16777215;
   }

   public void func_110780_a(C_100994_tv var1, C_100873_xe var2, C_100730_lb var3, int var4, boolean var5) {}

   public void func_110762_d(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {}

   public boolean func_110796_f() {
      return false;
   }

   public C_100943_uw func_110777_d_(C_100994_tv var1) {
      return C_100943_uw.field_111101_a;
   }

   public int func_110769_a(C_100994_tv var1) {
      return 0;
   }

   public void func_110778_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3, int var4) {}

   protected C_100992_tt func_110785_c(String var1) {
      this.field_110884_ck = var1;
      return this;
   }

   public String func_110749_u() {
      return this.field_110884_ck;
   }

   public boolean func_110754_v() {
      return this.field_110884_ck != null;
   }

   public void func_110784_a(C_100994_tv var1, C_101095_qg var2, List var3, boolean var4) {}

   public String func_110750_j(C_100994_tv var1) {
      return ("" + C_100361_be.func_107654_a().func_107655_c(this.func_110782_g(var1))).trim();
   }

   public boolean func_110747_d(C_100994_tv var1) {
      return var1.func_111358_w();
   }

   public C_100963_uf func_110794_e(C_100994_tv var1) {
      return var1.func_111358_w()?C_100963_uf.field_111164_c:C_100963_uf.field_111165_a;
   }

   public boolean func_110786_k(C_100994_tv var1) {
      return this.func_110771_k() == 1 && this.func_110765_n();
   }

   protected C_100383_amu func_110773_a(C_100873_xe var1, C_101095_qg var2, boolean var3) {
      float var4 = 1.0F;
      float var5 = var2.field_103179_C + (var2.field_103177_A - var2.field_103179_C) * var4;
      float var6 = var2.field_103178_B + (var2.field_103236_z - var2.field_103178_B) * var4;
      double var7 = var2.field_103227_q + (var2.field_103221_t - var2.field_103227_q) * (double)var4;
      double var9 = var2.field_103225_r + (var2.field_103219_u - var2.field_103225_r) * (double)var4 + 1.62D - (double)var2.field_103181_M;
      double var11 = var2.field_103223_s + (var2.field_103217_v - var2.field_103223_s) * (double)var4;
      C_100387_amw var13 = var1.func_109363_R().func_107878_a(var7, var9, var11);
      float var14 = C_100650_jv.func_108928_b(-var6 * 0.017453292F - 3.1415927F);
      float var15 = C_100650_jv.func_108924_a(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -C_100650_jv.func_108928_b(-var5 * 0.017453292F);
      float var17 = C_100650_jv.func_108924_a(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = 5.0D;
      C_100387_amw var23 = var13.func_107856_c((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      return var1.func_109439_a(var13, var23, var3, !var3);
   }

   public int func_110768_c() {
      return 0;
   }

   public boolean func_110758_b() {
      return false;
   }

   public int func_110751_a(int var1, int var2) {
      return this.func_110787_b(var1);
   }

   public void func_110767_a(int var1, C_101040_sq var2, List var3) {
      var3.add(new C_100994_tv(var1, 1, 0));
   }

   public C_101040_sq func_110760_w() {
      return this.field_110837_a;
   }

   public C_100992_tt func_110802_a(C_101040_sq var1) {
      this.field_110837_a = var1;
      return this;
   }

   public boolean func_110752_x() {
      return true;
   }

   public boolean func_110790_a(C_100994_tv var1, C_100994_tv var2) {
      return false;
   }

   static {
      C_100818_jh.func_110010_c();
   }
}
