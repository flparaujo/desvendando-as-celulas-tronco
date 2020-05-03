package profbio.ufpb.mestrado.desvendandoascelulastronco.adapter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import profbio.ufpb.mestrado.desvendandoascelulastronco.R;
import profbio.ufpb.mestrado.desvendandoascelulastronco.model.Section;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class SectionAdapter extends RecyclerView.Adapter<SectionAdapter.SectionAdapterViewHolder> {

    private List<Section> sections;
    private Context context;

    public SectionAdapter(List<Section> sections, Context context) {
        this.sections = sections;
        this.context = context;
    }

    @NonNull
    @Override
    public SectionAdapter.SectionAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_section, parent, false);;
        return new SectionAdapterViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull SectionAdapter.SectionAdapterViewHolder holder, int position) {
        Section section = sections.get(position);
        holder.sectionTitle.setText(section.getTitle());
        holder.contentHidden.setText(section.getContent());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            holder.contentHidden.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }
    }

    @Override
    public int getItemCount() {
        return sections.size();
    }

    class SectionAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView sectionTitle;
        TextView contentHidden;
        LinearLayout contentHiddenContainer;
        ImageView iconExpand;
        RelativeLayout itemCard;

        SectionAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            itemCard = itemView.findViewById(R.id.section_item_card);
            sectionTitle = itemView.findViewById(R.id.section_title);
            contentHidden = itemView.findViewById(R.id.content_hidden);
            contentHiddenContainer = itemView.findViewById(R.id.content_hidden_container);
            iconExpand = itemView.findViewById(R.id.ic_expand);

            itemCard.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(contentHiddenContainer.getVisibility() == View.GONE) {
                ObjectAnimator.ofFloat(iconExpand, View.ROTATION, 0f, 180f).setDuration(200).start();
                contentHiddenContainer.setVisibility(View.VISIBLE);
                contentHiddenContainer.startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_down));
            } else {
                ObjectAnimator.ofFloat(iconExpand, View.ROTATION, 180f, 0f).setDuration(200).start();
                Animation animation = AnimationUtils.loadAnimation(context, R.anim.slide_up);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) { }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        contentHiddenContainer.setVisibility(View.GONE);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) { }
                });
                contentHiddenContainer.startAnimation(animation);
            }
        }
    }
}
