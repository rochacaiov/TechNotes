package br.caiorocha.technotes.view.MainActivity.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import br.caiorocha.technotes.R;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    private String[] titles;
    private String[] contents;
    private Context context;

    public NotesAdapter(Context context, String titles[], String contents[]){
        this.context = context;
        this.titles = titles;
        this.contents = contents;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.note_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(this.titles[position]);
        holder.content.setText(this.contents[position]);
    }

    @Override
    public int getItemCount() {
        return this.titles.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView title, content;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.note_title);
            this.content = itemView.findViewById(R.id.note_content);
        }
    }
}
