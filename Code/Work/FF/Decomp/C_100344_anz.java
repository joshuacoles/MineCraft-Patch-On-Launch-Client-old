import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

public final class C_100344_anz extends Provider implements C_100338_anv {

   private static String field_107571_c = "BouncyCastle Security Provider v1.47";
   public static String field_107572_a = "BC";
   public static final C_100336_anw field_107570_b = new C_100330_aob();
   private static final Map field_107568_d = new HashMap();
   private static final String[] field_107569_e = new String[]{"AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Skipjack", "TEA", "Twofish", "VMPC", "VMPCKSA3", "XTEA"};
   private static final String[] field_107566_f = new String[]{"X509"};
   private static final String[] field_107567_g = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal"};
   private static final String[] field_107573_h = new String[]{"GOST3411", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "Tiger", "Whirlpool"};


   public C_100344_anz() {
      super(field_107572_a, 1.47D, field_107571_c);
      AccessController.doPrivileged(new C_100322_aoa(this));
   }

   private void func_107562_a() {
      this.func_107564_a("org.bouncycastle.jcajce.provider.digest.", field_107573_h);
      this.func_107564_a("org.bouncycastle.jcajce.provider.symmetric.", field_107569_e);
      this.func_107564_a("org.bouncycastle.jcajce.provider.asymmetric.", field_107566_f);
      this.func_107564_a("org.bouncycastle.jcajce.provider.asymmetric.", field_107567_g);
      this.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
      this.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
      this.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
      this.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
      this.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
      this.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
      this.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
      this.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
      this.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
      this.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
      this.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
      this.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
      this.put("KeyStore.BKS", "org.bouncycastle.jce.provider.JDKKeyStore");
      this.put("KeyStore.BouncyCastle", "org.bouncycastle.jce.provider.JDKKeyStore$BouncyCastleStore");
      this.put("KeyStore.PKCS12", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
      this.put("KeyStore.BCPKCS12", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
      this.put("KeyStore.PKCS12-DEF", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
      this.put("KeyStore.PKCS12-3DES-40RC2", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
      this.put("KeyStore.PKCS12-3DES-3DES", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore3DES");
      this.put("KeyStore.PKCS12-DEF-3DES-40RC2", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
      this.put("KeyStore.PKCS12-DEF-3DES-3DES", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore3DES");
      this.put("Alg.Alias.KeyStore.UBER", "BouncyCastle");
      this.put("Alg.Alias.KeyStore.BOUNCYCASTLE", "BouncyCastle");
      this.put("Alg.Alias.KeyStore.bouncycastle", "BouncyCastle");
      this.put("AlgorithmParameters.IES", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$IES");
      this.put("AlgorithmParameters.PKCS12PBE", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$PKCS12PBE");
      this.put("AlgorithmParameters." + C_100362_ane.field_107713_z, "org.bouncycastle.jce.provider.JDKAlgorithmParameters$PBKDF2");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.1", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.2", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters." + C_100381_and.field_107826_l.func_107813_b(), "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters." + C_100381_and.field_107827_m.func_107813_b(), "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters." + C_100381_and.field_107824_n.func_107813_b(), "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters." + C_100381_and.field_107825_o.func_107813_b(), "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters." + C_100381_and.field_107833_p.func_107813_b(), "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters." + C_100381_and.field_107832_q.func_107813_b(), "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
      this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
      this.put("AlgorithmParameters.SHA1WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
      this.put("AlgorithmParameters.SHA224WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
      this.put("AlgorithmParameters.SHA256WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
      this.put("AlgorithmParameters.SHA384WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
      this.put("AlgorithmParameters.SHA512WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
      this.put("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
      this.put("Cipher.ECIES", "org.bouncycastle.jce.provider.JCEIESCipher$ECIES");
      this.put("Cipher.BrokenECIES", "org.bouncycastle.jce.provider.JCEIESCipher$BrokenECIES");
      this.put("Cipher.IES", "org.bouncycastle.jce.provider.JCEIESCipher$IES");
      this.put("Cipher.BrokenIES", "org.bouncycastle.jce.provider.JCEIESCipher$BrokenIES");
      this.put("Cipher.PBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndDES");
      this.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
      this.put("Cipher.PBEWITHMD5ANDRC2", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndRC2");
      this.put("Cipher.PBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndDES");
      this.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
      this.put("Cipher.PBEWITHSHA1ANDRC2", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndRC2");
      this.put("Cipher.PBEWITHSHAAND128BITRC2-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd128BitRC2");
      this.put("Cipher.PBEWITHSHAAND40BITRC2-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd40BitRC2");
      this.put("Cipher.PBEWITHSHAAND128BITRC4", "org.bouncycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd128BitRC4");
      this.put("Cipher.PBEWITHSHAAND40BITRC4", "org.bouncycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd40BitRC4");
      this.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "PBEWITHSHAAND128BITRC2-CBC");
      this.put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "PBEWITHSHAAND40BITRC2-CBC");
      this.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
      this.put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
      this.put("Alg.Alias.Cipher." + C_100381_and.field_107826_l.func_107813_b(), "PBEWITHSHAAND128BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher." + C_100381_and.field_107827_m.func_107813_b(), "PBEWITHSHAAND192BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher." + C_100381_and.field_107824_n.func_107813_b(), "PBEWITHSHAAND256BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher." + C_100381_and.field_107825_o.func_107813_b(), "PBEWITHSHA256AND128BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher." + C_100381_and.field_107833_p.func_107813_b(), "PBEWITHSHA256AND192BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher." + C_100381_and.field_107832_q.func_107813_b(), "PBEWITHSHA256AND256BITAES-CBC-BC");
      this.put("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
      this.put("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
      this.put("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
      this.put("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
      this.put("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
      this.put("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
      this.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
      this.put("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
      this.put("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
      this.put("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
      this.put("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
      this.put("Cipher.PBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAndTwofish");
      this.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
      this.put("Alg.Alias.Cipher." + C_100362_ane.field_107709_s, "PBEWITHMD2ANDDES");
      this.put("Alg.Alias.Cipher." + C_100362_ane.field_107708_t, "PBEWITHMD2ANDRC2");
      this.put("Alg.Alias.Cipher." + C_100362_ane.field_107707_u, "PBEWITHMD5ANDDES");
      this.put("Alg.Alias.Cipher." + C_100362_ane.field_107706_v, "PBEWITHMD5ANDDES");
      this.put("Alg.Alias.Cipher." + C_100362_ane.field_107705_w, "PBEWITHSHA1ANDDES");
      this.put("Alg.Alias.Cipher." + C_100362_ane.field_107715_x, "PBEWITHSHA1ANDRC2");
      this.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
      this.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
      this.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
      this.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
      this.put("SecretKeyFactory.PBEWITHMD2ANDDES", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndDES");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107709_s, "PBEWITHMD2ANDDES");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107708_t, "PBEWITHMD2ANDRC2");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107707_u, "PBEWITHMD5ANDDES");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107706_v, "PBEWITHMD5ANDDES");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107705_w, "PBEWITHSHA1ANDDES");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107715_x, "PBEWITHSHA1ANDRC2");
      this.put("SecretKeyFactory.PBEWITHMD2ANDRC2", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndRC2");
      this.put("SecretKeyFactory.PBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndDES");
      this.put("SecretKeyFactory.PBEWITHMD5ANDRC2", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndRC2");
      this.put("SecretKeyFactory.PBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndDES");
      this.put("SecretKeyFactory.PBEWITHSHA1ANDRC2", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndRC2");
      this.put("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES3Key");
      this.put("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES2Key");
      this.put("SecretKeyFactory.PBEWITHSHAAND128BITRC4", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC4");
      this.put("SecretKeyFactory.PBEWITHSHAAND40BITRC4", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC4");
      this.put("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC2");
      this.put("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC2");
      this.put("SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndTwofish");
      this.put("SecretKeyFactory.PBEWITHHMACRIPEMD160", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithRIPEMD160");
      this.put("SecretKeyFactory.PBEWITHHMACSHA1", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA");
      this.put("SecretKeyFactory.PBEWITHHMACTIGER", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithTiger");
      this.put("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And128BitAESCBCOpenSSL");
      this.put("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And192BitAESCBCOpenSSL");
      this.put("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And256BitAESCBCOpenSSL");
      this.put("Alg.Alias.SecretKeyFactory.PBE", "PBE/PKCS5");
      this.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHMD5ANDDES", "PBE/PKCS5");
      this.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHA1ANDDES", "PBE/PKCS5");
      this.put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
      this.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
      this.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PBE/PKCS12");
      this.put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAANDTWOFISH-CBC", "PBE/PKCS12");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107709_s, "PBEWITHMD2ANDDES");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107708_t, "PBEWITHMD2ANDRC2");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107707_u, "PBEWITHMD5ANDDES");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107706_v, "PBEWITHMD5ANDRC2");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107705_w, "PBEWITHSHA1ANDDES");
      this.put("Alg.Alias.SecretKeyFactory." + C_100362_ane.field_107715_x, "PBEWITHSHA1ANDRC2");
      this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
      this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
      this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
      this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
      this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
      this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
      this.put("Alg.Alias.SecretKeyFactory.1.3.14.3.2.26", "PBEWITHHMACSHA1");
      this.put("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
      this.put("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitAESBC");
      this.put("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd192BitAESBC");
      this.put("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd256BitAESBC");
      this.put("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And128BitAESBC");
      this.put("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And192BitAESBC");
      this.put("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And256BitAESBC");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory." + C_100381_and.field_107826_l.func_107813_b(), "PBEWITHSHAAND128BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory." + C_100381_and.field_107827_m.func_107813_b(), "PBEWITHSHAAND192BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory." + C_100381_and.field_107824_n.func_107813_b(), "PBEWITHSHAAND256BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory." + C_100381_and.field_107825_o.func_107813_b(), "PBEWITHSHA256AND128BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory." + C_100381_and.field_107833_p.func_107813_b(), "PBEWITHSHA256AND192BITAES-CBC-BC");
      this.put("Alg.Alias.SecretKeyFactory." + C_100381_and.field_107832_q.func_107813_b(), "PBEWITHSHA256AND256BITAES-CBC-BC");
      this.func_107565_b();
      this.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
      this.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
      this.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
      this.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
      this.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
      this.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
      this.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
      this.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
      this.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
      this.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
   }

   private void func_107564_a(String var1, String[] var2) {
      for(int var3 = 0; var3 != var2.length; ++var3) {
         Class var4 = null;

         try {
            ClassLoader var5 = this.getClass().getClassLoader();
            if(var5 != null) {
               var4 = var5.loadClass(var1 + var2[var3] + "$Mappings");
            } else {
               var4 = Class.forName(var1 + var2[var3] + "$Mappings");
            }
         } catch (ClassNotFoundException var7) {
            ;
         }

         if(var4 != null) {
            try {
               ((C_100346_any)var4.newInstance()).func_107583_a(this);
            } catch (Exception var6) {
               var6.printStackTrace();
               throw new InternalError("cannot create instance of " + var1 + var2[var3] + "$Mappings : " + var6);
            }
         }
      }

   }

   private void func_107565_b() {
      this.put("Mac.DESWITHISO9797", "org.bouncycastle.jce.provider.JCEMac$DES9797Alg3");
      this.put("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
      this.put("Mac.ISO9797ALG3MAC", "org.bouncycastle.jce.provider.JCEMac$DES9797Alg3");
      this.put("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
      this.put("Mac.ISO9797ALG3WITHISO7816-4PADDING", "org.bouncycastle.jce.provider.JCEMac$DES9797Alg3with7816d4");
      this.put("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
      this.put("Mac.OLDHMACSHA384", "org.bouncycastle.jce.provider.JCEMac$OldSHA384");
      this.put("Mac.OLDHMACSHA512", "org.bouncycastle.jce.provider.JCEMac$OldSHA512");
      this.put("Mac.PBEWITHHMACSHA", "org.bouncycastle.jce.provider.JCEMac$PBEWithSHA");
      this.put("Mac.PBEWITHHMACSHA1", "org.bouncycastle.jce.provider.JCEMac$PBEWithSHA");
      this.put("Mac.PBEWITHHMACRIPEMD160", "org.bouncycastle.jce.provider.JCEMac$PBEWithRIPEMD160");
      this.put("Alg.Alias.Mac.1.3.14.3.2.26", "PBEWITHHMACSHA");
   }

   // $FF: synthetic method
   static void func_107563_a(C_100344_anz var0) {
      var0.func_107562_a();
   }

}
