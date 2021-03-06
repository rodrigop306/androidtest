package gustavo.ferreira.gittest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Gustavo on 02/06/2018.
 */

public class LineHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView language;

    public LineHolder(View itemView){
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.tvRepositoryTitle);
        language = (TextView) itemView.findViewById(R.id.tvRepositoryLanguage);
    }
}
