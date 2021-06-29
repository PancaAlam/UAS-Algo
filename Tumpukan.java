paket  Nomor1 ;
 kelas  publik Tumpukan {
     publik  int ukuran;
         tumpukan panjang publik ;
         int publik atas;
        
 Tumpukan publik ( int  s ){
    ukuran = s;
    tumpukan =  panjang baru  [ukuran];
    atas =  - 1 ;
}
 push kekosongan  publik ( j panjang ){ 
    tumpukan[ ++ atas] = j;
}
 pop panjang  publik (){
    kembali tumpukan[atas -- ];
}
 mengintip panjang  publik (){
    kembali tumpukan[atas];
}
 boolean  publik isEmpty (){
    return (atas == ukuran - 1 );
}
public  boolean  isFull (){
    return (atas == ukuran - 1 );
}
 baca batal  publik (){
    int saya = atas;
    sementara ( i >= 0 ){
        Sistem . keluar . print(tumpukan[i]);
        Sistem . keluar . cetak( "  " );
        saya -- ;
    }
    Sistem . keluar . println( "  " );
}
}