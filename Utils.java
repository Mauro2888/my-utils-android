public boolean permResutl(Context context, String[] arrayPerm){
    int req = ContextCompat.checkSelfPermission(context,arrayPerm[0]);
    return req == PackageManager.PERMISSION_GRANTED;
}


//POST

//create a json object with values and insert inside to writeBytes
/*

   URL url = new URL(strings[0]);
        urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("PUT");
        urlConnection.setRequestProperty("Content-Type", "application/json");

private JSONObject mPutUpdate = newJSONObject();
 mPutUpdate.put("name", mName.getText().toString());
*/

/*

        urlConnection.setDoOutput(true);
        DataOutputStream outputStream = new DataOutputStream(urlConnection.getOutputStream());
        outputStream.writeBytes(post);
        outputStream.flush();
        outputStream.close();
*/


public void getBytesFromFile(InputStream input, OutputStream output) throws IOException {
    byte[] bufferDati = new byte[1024];
    int readData;
    while ((readData = input.read(bufferDati))!= -1){
        output.write(bufferDati,0,readData);
    }if (output!= null){
        output.close();
    }
}

<meta-data android:name="android.max_aspect" android:value="2.1" />

public String SubtractHour(String ora){
        SimpleDateFormat mFormatOraFromRecycler = new SimpleDateFormat("HH.mm");
        Date dateRecy = null;
        Date dateNow = Calendar.getInstance().getTime();
        try {
            dateRecy = mFormatOraFromRecycler.parse(ora);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long subtract = dateRecy.getTime() - dateNow.getTime();
        Date formatAllMillisToHour = new Date(subtract - 2 * 60 * 60 * 1000);//converto 2 ore * 60 *60 * 1000 (millis )
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(formatAllMillisToHour);
        int ore = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
    
        return ore + " " + minute;
    }

public void checkOnlineState() { 
    ConnectivityManager CManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE); 
    NetworkInfo NInfo = CManager.getActiveNetworkInfo(); 
    if (NInfo != null && NInfo.isConnectedOrConnecting()) { 
        if (InetAddress.getByName("www.xy.com").isReachable(timeout)) 
        { // host reachable } else { // host not reachable } } return; }

Public void BitmapToInputStreaam(){
    ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
    bitmap.compress(CompressFormat.PNG, 0 /*ignored for PNG*/, bos); 
    byte[] bitmapdata = bos.toByteArray();
    ByteArrayInputStream bs = new ByteArrayInputStream(bitmapdata);


}
    
    public void recreateActivity() {
        Intent intent = getIntent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();
        overridePendingTransition(0, 0);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
    
     public static int calculateNoOfColumns(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        int noOfColumns = (int) (dpWidth / 180);
        return noOfColumns >= 2 ? noOfColumns : 2;
    }
private BroadcastReceiver networkReceiver = new BroadcastReceiver() {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ConnectivityManager.CONNECTIVITY_ACTION)) {
            NetworkInfo networkInfo = intent.getParcelableExtra(ConnectivityManager.EXTRA_NETWORK_INFO);
            if (networkInfo != null && networkInfo.getDetailedState() == NetworkInfo.DetailedState.CONNECTED) {
                Log.d(LOG_TAG, "We have internet connection. Good to go.");
            } else if (networkInfo != null && networkInfo.getDetailedState() == NetworkInfo.DetailedState.DISCONNECTED) {
                Log.d(LOG_TAG, "We have lost internet connection");
            }
        }
        //REMEMBER TO REGISTER AND UNREGISTER ON RESUME ON PAUSE
    }
