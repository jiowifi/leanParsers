public class MainActivity extends Activity {
private Button btn;
/**
 * help to toggle between play and pause.
 */
private boolean playPause;
private MediaPlayer mediaPlayer;
/**
 * remain false till media is not completed, inside OnCompletionListener make it true.
 */
private boolean intialStage = true;


@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    btn = (Button) findViewById(R.id.button1);
    mediaPlayer = new MediaPlayer();
    mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
    btn.setOnClickListener(pausePlay);

}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.activity_main, menu);
    return true;
}

private OnClickListener pausePlay = new OnClickListener() {

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub

        if (!playPause) {
            btn.setBackgroundResource(R.drawable.button_pause);
            if (intialStage)
                new Player()
                        .execute("http://www.virginmegastore.me/Library/Music/CD_001214/Tracks/Track1.mp3");
            else {
                if (!mediaPlayer.isPlaying())
                    mediaPlayer.start();
            }
            playPause = true;
        } else {
            btn.setBackgroundResource(R.drawable.button_play);
            if (mediaPlayer.isPlaying())
                mediaPlayer.pause();
            playPause = false;
        }
    }
};
/**
 * preparing mediaplayer will take sometime to buffer the content so prepare it inside the background thread and starting it on UI thread.
 * @author piyush
 *
 */

class Player extends AsyncTask<String, Void, Boolean> {
    private ProgressDialog progress;

    @Override
    protected Boolean doInBackground(String... params) {
        // TODO Auto-generated method stub
        Boolean prepared;
        try {

            mediaPlayer.setDataSource(params[0]);

            mediaPlayer.setOnCompletionListener(new OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mp) {
                    // TODO Auto-generated method stub
                    intialStage = true;
                    playPause=false;
                    btn.setBackgroundResource(R.drawable.button_play);
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                }
            });
            mediaPlayer.prepare();
            prepared = true;
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            Log.d("IllegarArgument", e.getMessage());
            prepared = false;
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            prepared = false;
            e.printStackTrace();
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            prepared = false;
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            prepared = false;
            e.printStackTrace();
        }
        return prepared;
    }

    @Override
    protected void onPostExecute(Boolean result) {
        // TODO Auto-generated method stub
        super.onPostExecute(result);
        if (progress.isShowing()) {
            progress.cancel();
        }
        Log.d("Prepared", "//" + result);
        mediaPlayer.start();

        intialStage = false;
    }

    public Player() {
        progress = new ProgressDialog(MainActivity.this);
    }

    @Override
    protected void onPreExecute() {
        // TODO Auto-generated method stub
        super.onPreExecute();
        this.progress.setMessage("Buffering...");
        this.progress.show();

    }
}

@Override
protected void onPause() {
    // TODO Auto-generated method stub
    super.onPause();
    if (mediaPlayer != null) {
        mediaPlayer.reset();
        mediaPlayer.release();
        mediaPlayer = null;
    }
}