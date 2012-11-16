import java.util.List;
import java.util.Random;

public class C_100451_alf {

   private C_101040_sq field_106102_a;
   public static final C_100445_alj field_106099_d = new C_100445_alj("stone", 1.0F, 1.0F);
   public static final C_100445_alj field_106100_e = new C_100445_alj("wood", 1.0F, 1.0F);
   public static final C_100445_alj field_106097_f = new C_100445_alj("gravel", 1.0F, 1.0F);
   public static final C_100445_alj field_106098_g = new C_100445_alj("grass", 1.0F, 1.0F);
   public static final C_100445_alj field_106109_h = new C_100445_alj("stone", 1.0F, 1.0F);
   public static final C_100445_alj field_106110_i = new C_100445_alj("stone", 1.0F, 1.5F);
   public static final C_100445_alj field_106107_j = new C_100441_alg("stone", 1.0F, 1.0F);
   public static final C_100445_alj field_106108_k = new C_100445_alj("cloth", 1.0F, 1.0F);
   public static final C_100445_alj field_106105_l = new C_100445_alj("sand", 1.0F, 1.0F);
   public static final C_100445_alj field_106106_m = new C_100445_alj("snow", 1.0F, 1.0F);
   public static final C_100445_alj field_106103_n = new C_100442_alh("ladder", 1.0F, 1.0F);
   public static final C_100445_alj field_106104_o = new C_100443_ali("anvil", 0.3F, 1.0F);
   public static final C_100451_alf[] field_106118_p = new C_100451_alf[4096];
   public static final boolean[] field_106117_q = new boolean[4096];
   public static final int[] field_106116_r = new int[4096];
   public static final boolean[] field_106115_s = new boolean[4096];
   public static final int[] field_106114_t = new int[4096];
   public static final boolean[] field_106113_u = new boolean[4096];
   public static boolean[] field_106112_v = new boolean[4096];
   public static final C_100451_alf field_106111_w = (new C_100454_ala(1, 1)).func_106006_c(1.5F).func_106064_b(10.0F).func_106014_a(field_106109_h).func_106022_b("stone");
   public static final C_100160_aiy field_106121_x = (C_100160_aiy)(new C_100160_aiy(2)).func_106006_c(0.6F).func_106014_a(field_106098_g).func_106022_b("grass");
   public static final C_100451_alf field_106120_y = (new C_100188_aik(3, 2)).func_106006_c(0.5F).func_106014_a(field_106097_f).func_106022_b("dirt");
   public static final C_100451_alf field_106119_z = (new C_100451_alf(4, 16, C_100664_afg.field_109009_e)).func_106006_c(2.0F).func_106064_b(10.0F).func_106014_a(field_106109_h).func_106022_b("stonebrick").func_106034_a(C_101040_sq.field_111417_b);
   public static final C_100451_alf field_106075_A = (new C_100427_alx(5)).func_106006_c(2.0F).func_106064_b(5.0F).func_106014_a(field_106100_e).func_106022_b("wood").func_105983_r();
   public static final C_100451_alf field_106076_B = (new C_100482_akp(6, 15)).func_106006_c(0.0F).func_106014_a(field_106098_g).func_106022_b("sapling").func_105983_r();
   public static final C_100451_alf field_106077_C = (new C_100451_alf(7, 17, C_100664_afg.field_109009_e)).func_105997_s().func_106064_b(6000000.0F).func_106014_a(field_106109_h).func_106022_b("bedrock").func_106015_D().func_106034_a(C_101040_sq.field_111417_b);
   public static final C_100451_alf field_106071_D = (new C_100144_ajn(8, C_100664_afg.field_109019_h)).func_106006_c(100.0F).func_106048_h(3).func_106022_b("water").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106072_E = (new C_100138_ajo(9, C_100664_afg.field_109019_h)).func_106006_c(100.0F).func_106048_h(3).func_106022_b("water").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106073_F = (new C_100144_ajn(10, C_100664_afg.field_109020_i)).func_106006_c(0.0F).func_106046_a(1.0F).func_106048_h(255).func_106022_b("lava").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106074_G = (new C_100138_ajo(11, C_100664_afg.field_109020_i)).func_106006_c(100.0F).func_106046_a(1.0F).func_106048_h(255).func_106022_b("lava").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106082_H = (new C_100173_ajc(12, 18)).func_106006_c(0.5F).func_106014_a(field_106105_l).func_106022_b("sand");
   public static final C_100451_alf field_106083_I = (new C_100162_aiz(13, 19)).func_106006_c(0.6F).func_106014_a(field_106097_f).func_106022_b("gravel");
   public static final C_100451_alf field_106084_J = (new C_100112_aka(14, 32)).func_106006_c(3.0F).func_106064_b(5.0F).func_106014_a(field_106109_h).func_106022_b("oreGold");
   public static final C_100451_alf field_106085_K = (new C_100112_aka(15, 33)).func_106006_c(3.0F).func_106064_b(5.0F).func_106014_a(field_106109_h).func_106022_b("oreIron");
   public static final C_100451_alf field_106078_L = (new C_100112_aka(16, 34)).func_106006_c(3.0F).func_106064_b(5.0F).func_106014_a(field_106109_h).func_106022_b("oreCoal");
   public static final C_100451_alf field_106079_M = (new C_100435_alp(17)).func_106006_c(2.0F).func_106014_a(field_106100_e).func_106022_b("log").func_105983_r();
   public static final C_100135_aji field_106080_N = (C_100135_aji)(new C_100135_aji(18, 52)).func_106006_c(0.2F).func_106048_h(1).func_106014_a(field_106098_g).func_106022_b("leaves").func_105983_r();
   public static final C_100451_alf field_106081_O = (new C_100474_aku(19)).func_106006_c(0.6F).func_106014_a(field_106098_g).func_106022_b("sponge");
   public static final C_100451_alf field_106091_P = (new C_100161_aix(20, 49, C_100664_afg.field_109026_r, false)).func_106006_c(0.3F).func_106014_a(field_106107_j).func_106022_b("glass");
   public static final C_100451_alf field_106090_Q = (new C_100112_aka(21, 160)).func_106006_c(3.0F).func_106064_b(5.0F).func_106014_a(field_106109_h).func_106022_b("oreLapis");
   public static final C_100451_alf field_106093_R = (new C_100451_alf(22, 144, C_100664_afg.field_109009_e)).func_106006_c(3.0F).func_106064_b(5.0F).func_106014_a(field_106109_h).func_106022_b("blockLapis").func_106034_a(C_101040_sq.field_111417_b);
   public static final C_100451_alf field_106092_S = (new C_100190_ail(23)).func_106006_c(3.5F).func_106014_a(field_106109_h).func_106022_b("dispenser").func_105983_r();
   public static final C_100451_alf field_106087_T = (new C_100477_ako(24)).func_106014_a(field_106109_h).func_106006_c(0.8F).func_106022_b("sandStone").func_105983_r();
   public static final C_100451_alf field_106086_U = (new C_100156_aju(25)).func_106006_c(0.8F).func_106022_b("musicBlock").func_105983_r();
   public static final C_100451_alf field_106089_V = (new C_100255_ahq(26)).func_106006_c(0.2F).func_106022_b("bed").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106088_W = (new C_100127_akg(27, 179, true)).func_106006_c(0.7F).func_106014_a(field_106110_i).func_106022_b("goldenRail").func_105983_r();
   public static final C_100451_alf field_106095_X = (new C_100182_aih(28, 195)).func_106006_c(0.7F).func_106014_a(field_106110_i).func_106022_b("detectorRail").func_105983_r();
   public static final C_100451_alf field_106094_Y = (new C_100404_amn(29, 106, true)).func_106022_b("pistonStickyBase").func_105983_r();
   public static final C_100451_alf field_106096_Z = (new C_100429_alv(30, 11)).func_106048_h(1).func_106006_c(4.0F).func_106022_b("web");
   public static final C_100456_alb field_106244_aa = (C_100456_alb)(new C_100456_alb(31, 39)).func_106006_c(0.0F).func_106014_a(field_106098_g).func_106022_b("tallgrass");
   public static final C_100225_aig field_106246_ab = (C_100225_aig)(new C_100225_aig(32, 55)).func_106006_c(0.0F).func_106014_a(field_106098_g).func_106022_b("deadbush");
   public static final C_100451_alf field_106240_ac = (new C_100404_amn(33, 107, false)).func_106022_b("pistonBase").func_105983_r();
   public static final C_100402_amo field_106242_ad = (C_100402_amo)(new C_100402_amo(34, 107)).func_105983_r();
   public static final C_100451_alf field_106252_ae = (new C_100230_aib()).func_106006_c(0.8F).func_106014_a(field_106108_k).func_106022_b("cloth").func_105983_r();
   public static final C_100408_amp field_106254_af = new C_100408_amp(36);
   public static final C_100253_aht field_106248_ag = (C_100253_aht)(new C_100253_aht(37, 13)).func_106006_c(0.0F).func_106014_a(field_106098_g).func_106022_b("flower");
   public static final C_100253_aht field_106250_ah = (C_100253_aht)(new C_100253_aht(38, 12)).func_106006_c(0.0F).func_106014_a(field_106098_g).func_106022_b("rose");
   public static final C_100253_aht field_106228_ai = (C_100253_aht)(new C_100147_ajt(39, 29)).func_106006_c(0.0F).func_106014_a(field_106098_g).func_106046_a(0.125F).func_106022_b("mushroom");
   public static final C_100253_aht field_106230_aj = (C_100253_aht)(new C_100147_ajt(40, 28)).func_106006_c(0.0F).func_106014_a(field_106098_g).func_106022_b("mushroom");
   public static final C_100451_alf field_106224_ak = (new C_100151_ajr(41, 23)).func_106006_c(3.0F).func_106064_b(10.0F).func_106014_a(field_106110_i).func_106022_b("blockGold");
   public static final C_100451_alf field_106226_al = (new C_100151_ajr(42, 22)).func_106006_c(5.0F).func_106064_b(10.0F).func_106014_a(field_106110_i).func_106022_b("blockIron");
   public static final C_100169_aja field_106236_am = (C_100169_aja)(new C_100458_akz(43, true)).func_106006_c(2.0F).func_106064_b(10.0F).func_106014_a(field_106109_h).func_106022_b("stoneSlab");
   public static final C_100169_aja field_106238_an = (C_100169_aja)(new C_100458_akz(44, false)).func_106006_c(2.0F).func_106064_b(10.0F).func_106014_a(field_106109_h).func_106022_b("stoneSlab");
   public static final C_100451_alf field_106232_ao = (new C_100451_alf(45, 7, C_100664_afg.field_109009_e)).func_106006_c(2.0F).func_106064_b(10.0F).func_106014_a(field_106109_h).func_106022_b("brick").func_106034_a(C_101040_sq.field_111417_b);
   public static final C_100451_alf field_106234_ap = (new C_100440_alk(46, 8)).func_106006_c(0.0F).func_106014_a(field_106098_g).func_106022_b("tnt");
   public static final C_100451_alf field_106214_aq = (new C_100257_ahr(47, 35)).func_106006_c(1.5F).func_106014_a(field_106100_e).func_106022_b("bookshelf");
   public static final C_100451_alf field_106212_ar = (new C_100451_alf(48, 36, C_100664_afg.field_109009_e)).func_106006_c(2.0F).func_106064_b(10.0F).func_106014_a(field_106109_h).func_106022_b("stoneMoss").func_106034_a(C_101040_sq.field_111417_b);
   public static final C_100451_alf field_106210_as = (new C_100110_ajz(49, 37)).func_106006_c(50.0F).func_106064_b(2000.0F).func_106014_a(field_106109_h).func_106022_b("obsidian");
   public static final C_100451_alf field_106208_at = (new C_100438_alm(50, 80)).func_106006_c(0.0F).func_106046_a(0.9375F).func_106014_a(field_106100_e).func_106022_b("torch").func_105983_r();
   public static final C_100208_aiu field_106222_au = (C_100208_aiu)(new C_100208_aiu(51, 31)).func_106006_c(0.0F).func_106046_a(1.0F).func_106014_a(field_106100_e).func_106022_b("fire").func_106015_D();
   public static final C_100451_alf field_106220_av = (new C_100145_ajs(52, 65)).func_106006_c(5.0F).func_106014_a(field_106110_i).func_106022_b("mobSpawner").func_106015_D();
   public static final C_100451_alf field_106218_aw = (new C_100463_akw(53, field_106075_A, 0)).func_106022_b("stairsWood").func_105983_r();
   public static final C_100451_alf field_106216_ax = (new C_100218_ahz(54)).func_106006_c(2.5F).func_106014_a(field_106100_e).func_106022_b("chest").func_105983_r();
   public static final C_100451_alf field_106203_ay = (new C_100484_akk(55, 164)).func_106006_c(0.0F).func_106014_a(field_106099_d).func_106022_b("redstoneDust").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106201_az = (new C_100112_aka(56, 50)).func_106006_c(3.0F).func_106064_b(5.0F).func_106014_a(field_106109_h).func_106022_b("oreDiamond");
   public static final C_100451_alf field_106193_aA = (new C_100151_ajr(57, 24)).func_106006_c(5.0F).func_106064_b(10.0F).func_106014_a(field_106110_i).func_106022_b("blockDiamond");
   public static final C_100451_alf field_106194_aB = (new C_100426_aly(58)).func_106006_c(2.5F).func_106014_a(field_106100_e).func_106022_b("workbench");
   public static final C_100451_alf field_106195_aC = (new C_100226_aif(59, 88)).func_106022_b("crops");
   public static final C_100451_alf field_106196_aD = (new C_100202_air(60)).func_106006_c(0.6F).func_106014_a(field_106097_f).func_106022_b("farmland").func_105983_r();
   public static final C_100451_alf field_106197_aE = (new C_100212_aiw(61, false)).func_106006_c(3.5F).func_106014_a(field_106109_h).func_106022_b("furnace").func_105983_r().func_106034_a(C_101040_sq.field_111418_c);
   public static final C_100451_alf field_106198_aF = (new C_100212_aiw(62, true)).func_106006_c(3.5F).func_106014_a(field_106109_h).func_106046_a(0.875F).func_106022_b("furnace").func_105983_r();
   public static final C_100451_alf field_106199_aG = (new C_100480_akq(63, C_100414_amj.class, true)).func_106006_c(1.0F).func_106014_a(field_106100_e).func_106022_b("sign").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106200_aH = (new C_100192_aim(64, C_100664_afg.field_109008_d)).func_106006_c(3.0F).func_106014_a(field_106100_e).func_106022_b("doorWood").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106185_aI = (new C_100179_ajh(65, 83)).func_106006_c(0.4F).func_106014_a(field_106103_n).func_106022_b("ladder").func_105983_r();
   public static final C_100451_alf field_106186_aJ = (new C_100127_akg(66, 128, false)).func_106006_c(0.7F).func_106014_a(field_106110_i).func_106022_b("rail").func_105983_r();
   public static final C_100451_alf field_106187_aK = (new C_100463_akw(67, field_106119_z, 0)).func_106022_b("stairsStone").func_105983_r();
   public static final C_100451_alf field_106188_aL = (new C_100480_akq(68, C_100414_amj.class, false)).func_106006_c(1.0F).func_106014_a(field_106100_e).func_106022_b("sign").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106189_aM = (new C_100131_ajk(69, 96)).func_106006_c(0.5F).func_106014_a(field_106100_e).func_106022_b("lever").func_105983_r();
   public static final C_100451_alf field_106190_aN = (new C_100119_akd(70, field_106111_w.field_106165_cl, C_100117_ake.field_106475_b, C_100664_afg.field_109009_e)).func_106006_c(0.5F).func_106014_a(field_106109_h).func_106022_b("pressurePlate").func_105983_r();
   public static final C_100451_alf field_106191_aO = (new C_100192_aim(71, C_100664_afg.field_109006_f)).func_106006_c(5.0F).func_106014_a(field_106110_i).func_106022_b("doorIron").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106192_aP = (new C_100119_akd(72, field_106075_A.field_106165_cl, C_100117_ake.field_106477_a, C_100664_afg.field_109008_d)).func_106006_c(0.5F).func_106014_a(field_106100_e).func_106022_b("pressurePlate").func_105983_r();
   public static final C_100451_alf field_106178_aQ = (new C_100490_akl(73, 51, false)).func_106006_c(3.0F).func_106064_b(5.0F).func_106014_a(field_106109_h).func_106022_b("oreRedstone").func_105983_r().func_106034_a(C_101040_sq.field_111417_b);
   public static final C_100451_alf field_106177_aR = (new C_100490_akl(74, 51, true)).func_106046_a(0.625F).func_106006_c(3.0F).func_106064_b(5.0F).func_106014_a(field_106109_h).func_106022_b("oreRedstone").func_105983_r();
   public static final C_100451_alf field_106180_aS = (new C_100154_ajx(75, 115, false)).func_106006_c(0.0F).func_106014_a(field_106100_e).func_106022_b("notGate").func_105983_r();
   public static final C_100451_alf field_106179_aT = (new C_100154_ajx(76, 99, true)).func_106006_c(0.0F).func_106046_a(0.5F).func_106014_a(field_106100_e).func_106022_b("notGate").func_105983_r().func_106034_a(C_101040_sq.field_111415_d);
   public static final C_100451_alf field_106182_aU = (new C_100247_ahu(77, field_106111_w.field_106165_cl, false)).func_106006_c(0.5F).func_106014_a(field_106109_h).func_106022_b("button").func_105983_r();
   public static final C_100451_alf field_106181_aV = (new C_100439_all(78, 66)).func_106006_c(0.1F).func_106014_a(field_106106_m).func_106022_b("snow").func_105983_r().func_106048_h(0);
   public static final C_100451_alf field_106184_aW = (new C_100180_ajg(79, 67)).func_106006_c(0.5F).func_106048_h(3).func_106014_a(field_106107_j).func_106022_b("ice");
   public static final C_100451_alf field_106183_aX = (new C_100476_akt(80, 66)).func_106006_c(0.2F).func_106014_a(field_106106_m).func_106022_b("snow");
   public static final C_100451_alf field_106175_aY = (new C_100249_ahv(81, 70)).func_106006_c(0.4F).func_106014_a(field_106108_k).func_106022_b("cactus");
   public static final C_100451_alf field_106174_aZ = (new C_100232_aia(82, 72)).func_106006_c(0.6F).func_106014_a(field_106097_f).func_106022_b("clay");
   public static final C_100451_alf field_106205_ba = (new C_100479_akn(83, 73)).func_106006_c(0.0F).func_106014_a(field_106098_g).func_106022_b("reeds").func_106015_D();
   public static final C_100451_alf field_106146_bb = (new C_100125_aki(84, 74)).func_106006_c(2.0F).func_106064_b(10.0F).func_106014_a(field_106109_h).func_106022_b("jukebox").func_105983_r();
   public static final C_100451_alf field_106147_bc = (new C_100206_ait(85, 4)).func_106006_c(2.0F).func_106064_b(5.0F).func_106014_a(field_106100_e).func_106022_b("fence");
   public static final C_100451_alf field_106148_bd = (new C_100129_akf(86, 102, false)).func_106006_c(1.0F).func_106014_a(field_106100_e).func_106022_b("pumpkin").func_105983_r();
   public static final C_100451_alf field_106149_be = (new C_100177_aje(87, 103)).func_106006_c(0.4F).func_106014_a(field_106109_h).func_106022_b("hellrock");
   public static final C_100451_alf field_106141_bf = (new C_100171_ajd(88, 104)).func_106006_c(0.5F).func_106014_a(field_106105_l).func_106022_b("hellsand");
   public static final C_100451_alf field_106142_bg = (new C_100133_ajl(89, 105, C_100664_afg.field_109026_r)).func_106006_c(0.3F).func_106014_a(field_106107_j).func_106046_a(1.0F).func_106022_b("lightgem");
   public static final C_100123_akb field_106143_bh = (C_100123_akb)(new C_100123_akb(90, 14)).func_106006_c(-1.0F).func_106014_a(field_106107_j).func_106046_a(0.75F).func_106022_b("portal");
   public static final C_100451_alf field_106144_bi = (new C_100129_akf(91, 102, true)).func_106006_c(1.0F).func_106014_a(field_106100_e).func_106046_a(1.0F).func_106022_b("litpumpkin").func_105983_r();
   public static final C_100451_alf field_106137_bj = (new C_100224_ahw(92, 121)).func_106006_c(0.5F).func_106014_a(field_106108_k).func_106022_b("cake").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106138_bk = (new C_100184_aii(93, false)).func_106006_c(0.0F).func_106014_a(field_106100_e).func_106022_b("diode").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106139_bl = (new C_100184_aii(94, true)).func_106006_c(0.0F).func_106046_a(0.625F).func_106014_a(field_106100_e).func_106022_b("diode").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106140_bm = (new C_100140_ajp(95)).func_106006_c(0.0F).func_106046_a(1.0F).func_106014_a(field_106100_e).func_106022_b("lockedchest").func_105972_b(true).func_105983_r();
   public static final C_100451_alf field_106133_bn = (new C_100436_alo(96, C_100664_afg.field_109008_d)).func_106006_c(3.0F).func_106014_a(field_106100_e).func_106022_b("trapdoor").func_106015_D().func_105983_r();
   public static final C_100451_alf field_106134_bo = (new C_100466_aky(97)).func_106006_c(0.75F).func_106022_b("monsterStoneEgg");
   public static final C_100451_alf field_106135_bp = (new C_100470_aks(98)).func_106006_c(1.5F).func_106064_b(10.0F).func_106014_a(field_106109_h).func_106022_b("stonebricksmooth");
   public static final C_100451_alf field_106136_bq = (new C_100175_ajf(99, C_100664_afg.field_109008_d, 142, 0)).func_106006_c(0.2F).func_106014_a(field_106100_e).func_106022_b("mushroom").func_105983_r();
   public static final C_100451_alf field_106130_br = (new C_100175_ajf(100, C_100664_afg.field_109008_d, 142, 1)).func_106006_c(0.2F).func_106014_a(field_106100_e).func_106022_b("mushroom").func_105983_r();
   public static final C_100451_alf field_106129_bs = (new C_100450_ale(101, 85, 85, C_100664_afg.field_109006_f, true)).func_106006_c(5.0F).func_106064_b(10.0F).func_106014_a(field_106110_i).func_106022_b("fenceIron");
   public static final C_100451_alf field_106132_bt = (new C_100450_ale(102, 49, 148, C_100664_afg.field_109026_r, false)).func_106006_c(0.3F).func_106014_a(field_106107_j).func_106022_b("thinGlass");
   public static final C_100451_alf field_106131_bu = (new C_100149_ajq(103)).func_106006_c(1.0F).func_106014_a(field_106100_e).func_106022_b("melon");
   public static final C_100451_alf field_106126_bv = (new C_100468_akx(104, field_106148_bd)).func_106006_c(0.0F).func_106014_a(field_106100_e).func_106022_b("pumpkinStem").func_105983_r();
   public static final C_100451_alf field_106125_bw = (new C_100468_akx(105, field_106131_bu)).func_106006_c(0.0F).func_106014_a(field_106100_e).func_106022_b("pumpkinStem").func_105983_r();
   public static final C_100451_alf field_106128_bx = (new C_100432_als(106)).func_106006_c(0.2F).func_106014_a(field_106098_g).func_106022_b("vine").func_105983_r();
   public static final C_100451_alf field_106127_by = (new C_100204_ais(107, 4)).func_106006_c(2.0F).func_106064_b(5.0F).func_106014_a(field_106100_e).func_106022_b("fenceGate").func_105983_r();
   public static final C_100451_alf field_106124_bz = (new C_100463_akw(108, field_106232_ao, 0)).func_106022_b("stairsBrick").func_105983_r();
   public static final C_100451_alf field_106176_bA = (new C_100463_akw(109, field_106135_bp, 0)).func_106022_b("stairsStoneBrickSmooth").func_105983_r();
   public static final C_100158_ajv field_106243_bB = (C_100158_ajv)(new C_100158_ajv(110)).func_106006_c(0.6F).func_106014_a(field_106098_g).func_106022_b("mycel");
   public static final C_100451_alf field_106245_bC = (new C_100430_alu(111, 76)).func_106006_c(0.0F).func_106014_a(field_106098_g).func_106022_b("waterlily");
   public static final C_100451_alf field_106239_bD = (new C_100451_alf(112, 224, C_100664_afg.field_109009_e)).func_106006_c(2.0F).func_106064_b(10.0F).func_106014_a(field_106109_h).func_106022_b("netherBrick").func_106034_a(C_101040_sq.field_111417_b);
   public static final C_100451_alf field_106241_bE = (new C_100206_ait(113, 224, C_100664_afg.field_109009_e)).func_106006_c(2.0F).func_106064_b(10.0F).func_106014_a(field_106109_h).func_106022_b("netherFence");
   public static final C_100451_alf field_106251_bF = (new C_100463_akw(114, field_106239_bD, 0)).func_106022_b("stairsNetherBrick").func_105983_r();
   public static final C_100451_alf field_106253_bG = (new C_100153_ajw(115)).func_106022_b("netherStalk").func_105983_r();
   public static final C_100451_alf field_106247_bH = (new C_100196_aio(116)).func_106006_c(5.0F).func_106064_b(2000.0F).func_106022_b("enchantmentTable");
   public static final C_100451_alf field_106249_bI = (new C_100251_ahs(117)).func_106006_c(0.5F).func_106046_a(0.125F).func_106022_b("brewingStand").func_105983_r();
   public static final C_100451_alf field_106227_bJ = (new C_100220_ahy(118)).func_106006_c(2.0F).func_106022_b("cauldron").func_105983_r();
   public static final C_100451_alf field_106229_bK = (new C_100447_alc(119, C_100664_afg.field_109000_C)).func_106006_c(-1.0F).func_106064_b(6000000.0F);
   public static final C_100451_alf field_106223_bL = (new C_100449_ald(120)).func_106014_a(field_106107_j).func_106046_a(0.125F).func_106006_c(-1.0F).func_106022_b("endPortalFrame").func_105983_r().func_106064_b(6000000.0F).func_106034_a(C_101040_sq.field_111418_c);
   public static final C_100451_alf field_106225_bM = (new C_100451_alf(121, 175, C_100664_afg.field_109009_e)).func_106006_c(3.0F).func_106064_b(15.0F).func_106014_a(field_106109_h).func_106022_b("whiteStone").func_106034_a(C_101040_sq.field_111417_b);
   public static final C_100451_alf field_106235_bN = (new C_100194_ain(122, 167)).func_106006_c(3.0F).func_106064_b(15.0F).func_106014_a(field_106109_h).func_106046_a(0.125F).func_106022_b("dragonEgg");
   public static final C_100451_alf field_106237_bO = (new C_100488_akm(123, false)).func_106006_c(0.3F).func_106014_a(field_106107_j).func_106022_b("redstoneLight").func_106034_a(C_101040_sq.field_111415_d);
   public static final C_100451_alf field_106231_bP = (new C_100488_akm(124, true)).func_106006_c(0.3F).func_106014_a(field_106107_j).func_106022_b("redstoneLight");
   public static final C_100169_aja field_106233_bQ = (C_100169_aja)(new C_100428_alw(125, true)).func_106006_c(2.0F).func_106064_b(5.0F).func_106014_a(field_106100_e).func_106022_b("woodSlab");
   public static final C_100169_aja field_106213_bR = (C_100169_aja)(new C_100428_alw(126, false)).func_106006_c(2.0F).func_106064_b(5.0F).func_106014_a(field_106100_e).func_106022_b("woodSlab");
   public static final C_100451_alf field_106211_bS = (new C_100228_aic(127)).func_106006_c(0.2F).func_106064_b(5.0F).func_106014_a(field_106100_e).func_106022_b("cocoa").func_105983_r();
   public static final C_100451_alf field_106209_bT = (new C_100463_akw(128, field_106087_T, 0)).func_106022_b("stairsSandStone").func_105983_r();
   public static final C_100451_alf field_106207_bU = (new C_100112_aka(129, 171)).func_106006_c(3.0F).func_106064_b(5.0F).func_106014_a(field_106109_h).func_106022_b("oreEmerald");
   public static final C_100451_alf field_106221_bV = (new C_100198_aip(130)).func_106006_c(22.5F).func_106064_b(1000.0F).func_106014_a(field_106109_h).func_106022_b("enderChest").func_105983_r().func_106046_a(0.5F);
   public static final C_100434_alq field_106219_bW = (C_100434_alq)(new C_100434_alq(131)).func_106022_b("tripWireSource").func_105983_r();
   public static final C_100451_alf field_106217_bX = (new C_100433_alr(132)).func_106022_b("tripWire").func_105983_r();
   public static final C_100451_alf field_106215_bY = (new C_100151_ajr(133, 25)).func_106006_c(5.0F).func_106064_b(10.0F).func_106014_a(field_106110_i).func_106022_b("blockEmerald");
   public static final C_100451_alf field_106202_bZ = (new C_100463_akw(134, field_106075_A, 1)).func_106022_b("stairsWoodSpruce").func_105983_r();
   public static final C_100451_alf field_106123_ca = (new C_100463_akw(135, field_106075_A, 2)).func_106022_b("stairsWoodBirch").func_105983_r();
   public static final C_100451_alf field_106122_cb = (new C_100463_akw(136, field_106075_A, 3)).func_106022_b("stairsWoodJungle").func_105983_r();
   public static final C_100451_alf field_106172_cc = (new C_100227_aid(137)).func_106022_b("commandBlock");
   public static final C_100451_alf field_106173_cd = (new C_100261_ahp(138)).func_106022_b("beacon").func_106046_a(1.0F);
   public static final C_100451_alf field_106170_ce = (new C_100431_alt(139, field_106119_z)).func_106022_b("cobbleWall");
   public static final C_100451_alf field_106171_cf = (new C_100210_aiv(140)).func_106006_c(0.0F).func_106014_a(field_106099_d).func_106022_b("flowerPot");
   public static final C_100451_alf field_106168_cg = (new C_100222_ahx(141)).func_106022_b("carrots");
   public static final C_100451_alf field_106169_ch = (new C_100121_akc(142)).func_106022_b("potatoes");
   public static final C_100451_alf field_106166_ci = (new C_100247_ahu(143, field_106075_A.field_106165_cl, true)).func_106006_c(0.5F).func_106014_a(field_106100_e).func_106022_b("button").func_105983_r();
   public static final C_100451_alf field_106167_cj = (new C_100472_akr(144)).func_106006_c(1.0F).func_106014_a(field_106109_h).func_106022_b("skull").func_105983_r();
   public static final C_100451_alf field_106164_ck = (new C_100259_aho(145)).func_106006_c(5.0F).func_106014_a(field_106104_o).func_106064_b(2000.0F).func_106022_b("anvil").func_105983_r();
   public int field_106165_cl;
   public final int field_106162_cm;
   protected float field_106163_cn;
   protected float field_106160_co;
   protected boolean field_106161_cp;
   protected boolean field_106158_cq;
   protected boolean field_106159_cr;
   protected boolean field_106157_cs;
   protected double field_106156_ct;
   protected double field_106155_cu;
   protected double field_106154_cv;
   protected double field_106153_cw;
   protected double field_106152_cx;
   protected double field_106151_cy;
   public C_100445_alj field_106150_cz;
   public float field_106206_cA;
   public final C_100664_afg field_106204_cB;
   public float field_106145_cC;
   private String field_106101_b;


   protected C_100451_alf(int var1, C_100664_afg var2) {
      this.field_106161_cp = true;
      this.field_106158_cq = true;
      this.field_106150_cz = field_106099_d;
      this.field_106206_cA = 1.0F;
      this.field_106145_cC = 0.6F;
      if(field_106118_p[var1] != null) {
         throw new IllegalArgumentException("Slot " + var1 + " is already occupied by " + field_106118_p[var1] + " when adding " + this);
      } else {
         this.field_106204_cB = var2;
         field_106118_p[var1] = this;
         this.field_106162_cm = var1;
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         field_106117_q[var1] = this.func_105994_c();
         field_106116_r[var1] = this.func_105994_c()?255:0;
         field_106115_s[var1] = !var2.func_108990_b();
      }
   }

   protected C_100451_alf func_105983_r() {
      field_106113_u[this.field_106162_cm] = true;
      return this;
   }

   protected void func_105973_t_() {}

   protected C_100451_alf(int var1, int var2, C_100664_afg var3) {
      this(var1, var3);
      this.field_106165_cl = var2;
   }

   protected C_100451_alf func_106014_a(C_100445_alj var1) {
      this.field_106150_cz = var1;
      return this;
   }

   protected C_100451_alf func_106048_h(int var1) {
      field_106116_r[this.field_106162_cm] = var1;
      return this;
   }

   protected C_100451_alf func_106046_a(float var1) {
      field_106114_t[this.field_106162_cm] = (int)(15.0F * var1);
      return this;
   }

   protected C_100451_alf func_106064_b(float var1) {
      this.field_106160_co = var1 * 3.0F;
      return this;
   }

   public static boolean func_106066_i(int var0) {
      C_100451_alf var1 = field_106118_p[var0];
      return var1 == null?false:var1.field_106204_cB.func_108980_k() && var1.func_105977_b();
   }

   public boolean func_105977_b() {
      return true;
   }

   public boolean func_105982_c(C_100837_xo var1, int var2, int var3, int var4) {
      return !this.field_106204_cB.func_108992_c();
   }

   public int func_106013_d() {
      return 0;
   }

   protected C_100451_alf func_106006_c(float var1) {
      this.field_106163_cn = var1;
      if(this.field_106160_co < var1 * 5.0F) {
         this.field_106160_co = var1 * 5.0F;
      }

      return this;
   }

   protected C_100451_alf func_105997_s() {
      this.func_106006_c(-1.0F);
      return this;
   }

   public float func_106018_m(C_100873_xe var1, int var2, int var3, int var4) {
      return this.field_106163_cn;
   }

   protected C_100451_alf func_105972_b(boolean var1) {
      this.field_106159_cr = var1;
      return this;
   }

   public boolean func_105984_t() {
      return this.field_106159_cr;
   }

   public boolean func_106037_u() {
      return this.field_106157_cs;
   }

   protected final void func_106008_a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_106156_ct = (double)var1;
      this.field_106155_cu = (double)var2;
      this.field_106154_cv = (double)var3;
      this.field_106153_cw = (double)var4;
      this.field_106152_cx = (double)var5;
      this.field_106151_cy = (double)var6;
   }

   public float func_106052_f(C_100837_xo var1, int var2, int var3, int var4) {
      return var1.func_109358_j(var2, var3, var4, field_106114_t[var1.func_109349_a(var2, var3, var4)]);
   }

   public int func_106050_e(C_100837_xo var1, int var2, int var3, int var4) {
      return var1.func_109355_i(var2, var3, var4, field_106114_t[var1.func_109349_a(var2, var3, var4)]);
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 && this.field_106155_cu > 0.0D?true:(var5 == 1 && this.field_106152_cx < 1.0D?true:(var5 == 2 && this.field_106154_cv > 0.0D?true:(var5 == 3 && this.field_106151_cy < 1.0D?true:(var5 == 4 && this.field_106156_ct > 0.0D?true:(var5 == 5 && this.field_106153_cw < 1.0D?true:!var1.func_109356_r(var2, var3, var4))))));
   }

   public boolean func_106061_a_(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return var1.func_109350_f(var2, var3, var4).func_108983_a();
   }

   public int func_105988_d(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return this.func_106029_a(var5, var1.func_109357_g(var2, var3, var4));
   }

   public int func_106029_a(int var1, int var2) {
      return this.func_106024_a(var1);
   }

   public int func_106024_a(int var1) {
      return this.field_106165_cl;
   }

   public C_100412_amr func_106031_b_(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100412_amr.func_107892_a().func_107844_a((double)var2 + this.field_106156_ct, (double)var3 + this.field_106155_cu, (double)var4 + this.field_106154_cv, (double)var2 + this.field_106153_cw, (double)var3 + this.field_106152_cx, (double)var4 + this.field_106151_cy);
   }

   public void func_105986_a(C_100873_xe var1, int var2, int var3, int var4, C_100412_amr var5, List var6, C_100730_lb var7) {
      C_100412_amr var8 = this.func_106021_e(var1, var2, var3, var4);
      if(var8 != null && var5.func_107898_a(var8)) {
         var6.add(var8);
      }

   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100412_amr.func_107892_a().func_107844_a((double)var2 + this.field_106156_ct, (double)var3 + this.field_106155_cu, (double)var4 + this.field_106154_cv, (double)var2 + this.field_106153_cw, (double)var3 + this.field_106152_cx, (double)var4 + this.field_106151_cy);
   }

   public boolean func_105994_c() {
      return true;
   }

   public boolean func_106010_a(int var1, boolean var2) {
      return this.func_106049_m();
   }

   public boolean func_106049_m() {
      return true;
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {}

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {}

   public void func_106020_c(C_100873_xe var1, int var2, int var3, int var4, int var5) {}

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {}

   public int func_106000_r_() {
      return 10;
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {}

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {}

   public int func_106063_a(Random var1) {
      return 1;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return this.field_106162_cm;
   }

   public float func_106009_a(C_101095_qg var1, C_100873_xe var2, int var3, int var4, int var5) {
      float var6 = this.func_106018_m(var2, var3, var4, var5);
      return var6 < 0.0F?0.0F:(!var1.func_103798_b(this)?1.0F / var6 / 100.0F:var1.func_103779_a(this) / var6 / 30.0F);
   }

   public final void func_106035_c(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      this.func_105998_a(var1, var2, var3, var4, var5, 1.0F, var6);
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.field_109557_J) {
         int var8 = this.func_106012_a(var7, var1.field_109577_u);

         for(int var9 = 0; var9 < var8; ++var9) {
            if(var1.field_109577_u.nextFloat() <= var6) {
               int var10 = this.func_106043_a(var5, var1.field_109577_u, var7);
               if(var10 > 0) {
                  this.func_106042_a(var1, var2, var3, var4, new C_100994_tv(var10, 1, this.func_106004_b(var5)));
               }
            }
         }

      }
   }

   protected void func_106042_a(C_100873_xe var1, int var2, int var3, int var4, C_100994_tv var5) {
      if(!var1.field_109557_J && var1.func_109389_K().func_110281_b("doTileDrops")) {
         float var6 = 0.7F;
         double var7 = (double)(var1.field_109577_u.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         double var9 = (double)(var1.field_109577_u.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         double var11 = (double)(var1.field_109577_u.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         C_100576_pg var13 = new C_100576_pg(var1, (double)var2 + var7, (double)var3 + var9, (double)var4 + var11, var5);
         var13.field_103278_c = 10;
         var1.func_109513_d(var13);
      }
   }

   protected void func_106005_f(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J) {
         while(var5 > 0) {
            int var6 = C_100722_lj.func_104589_a(var5);
            var5 -= var6;
            var1.func_109513_d(new C_100722_lj(var1, (double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, var6));
         }
      }

   }

   public int func_106004_b(int var1) {
      return 0;
   }

   public float func_105981_a(C_100730_lb var1) {
      return this.field_106160_co / 5.0F;
   }

   public C_100383_amu func_105992_a(C_100873_xe var1, int var2, int var3, int var4, C_100387_amw var5, C_100387_amw var6) {
      this.func_106007_a(var1, var2, var3, var4);
      var5 = var5.func_107856_c((double)(-var2), (double)(-var3), (double)(-var4));
      var6 = var6.func_107856_c((double)(-var2), (double)(-var3), (double)(-var4));
      C_100387_amw var7 = var5.func_107862_b(var6, this.field_106156_ct);
      C_100387_amw var8 = var5.func_107862_b(var6, this.field_106153_cw);
      C_100387_amw var9 = var5.func_107864_c(var6, this.field_106155_cu);
      C_100387_amw var10 = var5.func_107864_c(var6, this.field_106152_cx);
      C_100387_amw var11 = var5.func_107868_d(var6, this.field_106154_cv);
      C_100387_amw var12 = var5.func_107868_d(var6, this.field_106151_cy);
      if(!this.func_105975_a(var7)) {
         var7 = null;
      }

      if(!this.func_105975_a(var8)) {
         var8 = null;
      }

      if(!this.func_106040_b(var9)) {
         var9 = null;
      }

      if(!this.func_106040_b(var10)) {
         var10 = null;
      }

      if(!this.func_106036_c(var11)) {
         var11 = null;
      }

      if(!this.func_106036_c(var12)) {
         var12 = null;
      }

      C_100387_amw var13 = null;
      if(var7 != null && (var13 == null || var5.func_107860_e(var7) < var5.func_107860_e(var13))) {
         var13 = var7;
      }

      if(var8 != null && (var13 == null || var5.func_107860_e(var8) < var5.func_107860_e(var13))) {
         var13 = var8;
      }

      if(var9 != null && (var13 == null || var5.func_107860_e(var9) < var5.func_107860_e(var13))) {
         var13 = var9;
      }

      if(var10 != null && (var13 == null || var5.func_107860_e(var10) < var5.func_107860_e(var13))) {
         var13 = var10;
      }

      if(var11 != null && (var13 == null || var5.func_107860_e(var11) < var5.func_107860_e(var13))) {
         var13 = var11;
      }

      if(var12 != null && (var13 == null || var5.func_107860_e(var12) < var5.func_107860_e(var13))) {
         var13 = var12;
      }

      if(var13 == null) {
         return null;
      } else {
         byte var14 = -1;
         if(var13 == var7) {
            var14 = 4;
         }

         if(var13 == var8) {
            var14 = 5;
         }

         if(var13 == var9) {
            var14 = 0;
         }

         if(var13 == var10) {
            var14 = 1;
         }

         if(var13 == var11) {
            var14 = 2;
         }

         if(var13 == var12) {
            var14 = 3;
         }

         return new C_100383_amu(var2, var3, var4, var14, var13.func_107856_c((double)var2, (double)var3, (double)var4));
      }
   }

   private boolean func_105975_a(C_100387_amw var1) {
      return var1 == null?false:var1.field_107869_d >= this.field_106155_cu && var1.field_107869_d <= this.field_106152_cx && var1.field_107870_e >= this.field_106154_cv && var1.field_107870_e <= this.field_106151_cy;
   }

   private boolean func_106040_b(C_100387_amw var1) {
      return var1 == null?false:var1.field_107872_c >= this.field_106156_ct && var1.field_107872_c <= this.field_106153_cw && var1.field_107870_e >= this.field_106154_cv && var1.field_107870_e <= this.field_106151_cy;
   }

   private boolean func_106036_c(C_100387_amw var1) {
      return var1 == null?false:var1.field_107872_c >= this.field_106156_ct && var1.field_107872_c <= this.field_106153_cw && var1.field_107869_d >= this.field_106155_cu && var1.field_107869_d <= this.field_106152_cx;
   }

   public void func_105999_k(C_100873_xe var1, int var2, int var3, int var4) {}

   public int func_106055_n() {
      return 0;
   }

   public boolean func_106038_b_(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      return this.func_106023_b(var1, var2, var3, var4);
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109349_a(var2, var3, var4);
      return var5 == 0 || field_106118_p[var5].field_106204_cB.func_108984_j();
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      return false;
   }

   public void func_105990_b(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {}

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {}

   public void func_105993_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5) {}

   public void func_106051_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5, C_100387_amw var6) {}

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {}

   public final double func_106062_v() {
      return this.field_106156_ct;
   }

   public final double func_106027_w() {
      return this.field_106153_cw;
   }

   public final double func_106032_x() {
      return this.field_106155_cu;
   }

   public final double func_106068_y() {
      return this.field_106152_cx;
   }

   public final double func_105995_z() {
      return this.field_106154_cv;
   }

   public final double func_106002_A() {
      return this.field_106151_cy;
   }

   public int func_106039_o() {
      return 16777215;
   }

   public int func_106025_g_(int var1) {
      return 16777215;
   }

   public int func_106069_b(C_100837_xo var1, int var2, int var3, int var4) {
      return 16777215;
   }

   public boolean func_106030_b(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean func_106028_i() {
      return false;
   }

   public void func_106011_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {}

   public boolean func_105985_c(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public void func_106059_f() {}

   public void func_106026_a(C_100873_xe var1, C_101095_qg var2, int var3, int var4, int var5, int var6) {
      var2.func_103813_a(C_100818_jh.field_110020_C[this.field_106162_cm], 1);
      var2.func_103792_j(0.025F);
      if(this.func_106045_s_() && C_100878_wh.func_110583_d(var2)) {
         C_100994_tv var8 = this.func_106044_f_(var6);
         if(var8 != null) {
            this.func_106042_a(var1, var3, var4, var5, var8);
         }
      } else {
         int var7 = C_100878_wh.func_110580_e(var2);
         this.func_106035_c(var1, var3, var4, var5, var6, var7);
      }

   }

   protected boolean func_106045_s_() {
      return this.func_105977_b() && !this.field_106157_cs;
   }

   protected C_100994_tv func_106044_f_(int var1) {
      int var2 = 0;
      if(this.field_106162_cm >= 0 && this.field_106162_cm < C_100992_tt.field_110834_e.length && C_100992_tt.field_110834_e[this.field_106162_cm].func_110803_l()) {
         var2 = var1;
      }

      return new C_100994_tv(this.field_106162_cm, 1, var2);
   }

   public int func_106012_a(int var1, Random var2) {
      return this.func_106063_a(var2);
   }

   public boolean func_106001_d(C_100873_xe var1, int var2, int var3, int var4) {
      return true;
   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {}

   public C_100451_alf func_106022_b(String var1) {
      this.field_106101_b = "tile." + var1;
      return this;
   }

   public String func_106003_B() {
      return C_100359_bd.func_107638_a(this.func_106057_a() + ".name");
   }

   public String func_106057_a() {
      return this.field_106101_b;
   }

   public void func_105980_b(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {}

   public boolean func_106033_C() {
      return this.field_106158_cq;
   }

   protected C_100451_alf func_106015_D() {
      this.field_106158_cq = false;
      return this;
   }

   public int func_106058_q_() {
      return this.field_106204_cB.func_108988_m();
   }

   public float func_105991_j(C_100837_xo var1, int var2, int var3, int var4) {
      return var1.func_109360_s(var2, var3, var4)?0.2F:1.0F;
   }

   public void func_105978_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5, float var6) {}

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return this.field_106162_cm;
   }

   public int func_106019_h(C_100873_xe var1, int var2, int var3, int var4) {
      return this.func_106004_b(var1.func_109357_g(var2, var3, var4));
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      var3.add(new C_100994_tv(var1, 1, 0));
   }

   public C_101040_sq func_106016_E() {
      return this.field_106102_a;
   }

   public C_100451_alf func_106034_a(C_101040_sq var1) {
      this.field_106102_a = var1;
      return this;
   }

   public void func_106060_a(C_100873_xe var1, int var2, int var3, int var4, int var5, C_101095_qg var6) {}

   public void func_105989_g(C_100873_xe var1, int var2, int var3, int var4, int var5) {}

   public void func_106056_f(C_100873_xe var1, int var2, int var3, int var4) {}

   public boolean func_106053_u_() {
      return false;
   }

   public boolean func_106067_l() {
      return true;
   }

   static {
      C_100992_tt.field_110834_e[field_106252_ae.field_106162_cm] = (new C_101036_sm(field_106252_ae.field_106162_cm - 256)).func_110761_b("cloth");
      C_100992_tt.field_110834_e[field_106079_M.field_106162_cm] = (new C_100995_ub(field_106079_M.field_106162_cm - 256, field_106079_M, C_100435_alp.field_106416_a)).func_110761_b("log");
      C_100992_tt.field_110834_e[field_106075_A.field_106162_cm] = (new C_100995_ub(field_106075_A.field_106162_cm - 256, field_106075_A, C_100427_alx.field_106403_a)).func_110761_b("wood");
      C_100992_tt.field_110834_e[field_106134_bo.field_106162_cm] = (new C_100995_ub(field_106134_bo.field_106162_cm - 256, field_106134_bo, C_100466_aky.field_106453_a)).func_110761_b("monsterStoneEgg");
      C_100992_tt.field_110834_e[field_106135_bp.field_106162_cm] = (new C_100995_ub(field_106135_bp.field_106162_cm - 256, field_106135_bp, C_100470_aks.field_106454_a)).func_110761_b("stonebricksmooth");
      C_100992_tt.field_110834_e[field_106087_T.field_106162_cm] = (new C_100995_ub(field_106087_T.field_106162_cm - 256, field_106087_T, C_100477_ako.field_106455_a)).func_110761_b("sandStone");
      C_100992_tt.field_110834_e[field_106238_an.field_106162_cm] = (new C_100974_ut(field_106238_an.field_106162_cm - 256, field_106238_an, field_106236_am, false)).func_110761_b("stoneSlab");
      C_100992_tt.field_110834_e[field_106236_am.field_106162_cm] = (new C_100974_ut(field_106236_am.field_106162_cm - 256, field_106238_an, field_106236_am, true)).func_110761_b("stoneSlab");
      C_100992_tt.field_110834_e[field_106213_bR.field_106162_cm] = (new C_100974_ut(field_106213_bR.field_106162_cm - 256, field_106213_bR, field_106233_bQ, false)).func_110761_b("woodSlab");
      C_100992_tt.field_110834_e[field_106233_bQ.field_106162_cm] = (new C_100974_ut(field_106233_bQ.field_106162_cm - 256, field_106213_bR, field_106233_bQ, true)).func_110761_b("woodSlab");
      C_100992_tt.field_110834_e[field_106076_B.field_106162_cm] = (new C_100995_ub(field_106076_B.field_106162_cm - 256, field_106076_B, C_100482_akp.field_106388_a)).func_110761_b("sapling");
      C_100992_tt.field_110834_e[field_106080_N.field_106162_cm] = (new C_100993_tw(field_106080_N.field_106162_cm - 256)).func_110761_b("leaves");
      C_100992_tt.field_110834_e[field_106128_bx.field_106162_cm] = new C_101038_so(field_106128_bx.field_106162_cm - 256, false);
      C_100992_tt.field_110834_e[field_106244_aa.field_106162_cm] = (new C_101038_so(field_106244_aa.field_106162_cm - 256, true)).func_110987_a(new String[]{"shrub", "grass", "fern"});
      C_100992_tt.field_110834_e[field_106245_bC.field_106162_cm] = new C_100941_ux(field_106245_bC.field_106162_cm - 256);
      C_100992_tt.field_110834_e[field_106240_ac.field_106162_cm] = new C_100999_ud(field_106240_ac.field_106162_cm - 256);
      C_100992_tt.field_110834_e[field_106094_Y.field_106162_cm] = new C_100999_ud(field_106094_Y.field_106162_cm - 256);
      C_100992_tt.field_110834_e[field_106170_ce.field_106162_cm] = (new C_100995_ub(field_106170_ce.field_106162_cm - 256, field_106170_ce, C_100431_alt.field_106405_a)).func_110761_b("cobbleWall");
      C_100992_tt.field_110834_e[field_106164_ck.field_106162_cm] = (new C_101050_sb(field_106164_ck)).func_110761_b("anvil");

      for(int var0 = 0; var0 < 256; ++var0) {
         if(field_106118_p[var0] != null) {
            if(C_100992_tt.field_110834_e[var0] == null) {
               C_100992_tt.field_110834_e[var0] = new C_100945_uu(var0 - 256);
               field_106118_p[var0].func_105973_t_();
            }

            boolean var1 = false;
            if(var0 > 0 && field_106118_p[var0].func_106013_d() == 10) {
               var1 = true;
            }

            if(var0 > 0 && field_106118_p[var0] instanceof C_100169_aja) {
               var1 = true;
            }

            if(var0 == field_106196_aD.field_106162_cm) {
               var1 = true;
            }

            if(field_106115_s[var0]) {
               var1 = true;
            }

            if(field_106116_r[var0] == 0) {
               var1 = true;
            }

            field_106112_v[var0] = var1;
         }
      }

      field_106115_s[0] = true;
      C_100818_jh.func_110009_b();
   }
}
