paket  Nomor1 ;
 TumpukanApp kelas  publik {
    public  static  void  main ( String  args []){
        Tumpukan tumpukan =  baru  Tumpukan ( 10 );
        tumpukan . tekan( 8 );
        tumpukan . Baca();
        tumpukan . tekan( 2 );
        tumpukan . Baca();
        tumpukan . mendorong( 3 );
        tumpukan . Baca();
        Sistem . keluar . println( " nilai teratas = "  + tumpukan . peek());
        Sistem . keluar . println( " Panca Alam Kusuma " );
        Sistem . keluar . println( " nilai yang dihapus = "  + tumpukan . pop());
        tumpukan . Baca();
        Sistem . keluar . println( "  " );
        tumpukan . tekan( 4 );
        tumpukan . Baca();
        
    }
        
}
