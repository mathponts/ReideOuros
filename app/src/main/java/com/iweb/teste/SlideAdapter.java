package com.iweb.teste;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    MainActivity mainActivity;

    // list of images
    public int[] lst_images = {
            R.drawable.logo,
            R.drawable.image_1,
            R.drawable.image_1,
            R.drawable.image_1
    };
    // list of titles
    public String[] lst_title = {
            "CONCURSO DE BELEZA",
            "REGRAS",
            "REGRAS",
            "REGRAS"
    }   ;
    // list of descriptions
    public String[] lst_description = {
            "Este é o jogo do Rei de Ouros. ",
            "A cada rodada, cada jogador deverá escolher um número de 0 (zero) a 100 (cem). A média dos números selecionados é então multiplicada por 0,8 e o vencedor da rodada é o jogador cujo número escolhido está mais próximo da média.",
            "Todos os jogadores começam o jogo com a pontuação 0 (zero). O vencedor de cada rodada ganha um ponto, enquanto os demais perdem um ponto. O jogador que atingir -10 pontos será eliminado do jogo.",
            "Somente um jogador poderá zerar o jogo. Boa sorte."
    };
    // list of background colors
    public int[]  lst_backgroundcolor = {
            Color.rgb(7,26,33),
            Color.rgb(7,26,33),
            Color.rgb(7,26,33),
            Color.rgb(7,26,33)
    };


    public SlideAdapter(Context context, MainActivity mainActivity) {
        this.context = context;
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view== object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = view.findViewById(R.id.slideimg);
        TextView txttitle= view.findViewById(R.id.txttitle);
        TextView description = view.findViewById(R.id.txtdescription);
        if (position == 3) {
            Button btnIniciar = view.findViewById(R.id.btnIniciar);
            btnIniciar.setVisibility(View.VISIBLE);
            btnIniciar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mainActivity, Inscricoes.class);
                    view.getContext().startActivity(intent);
                }
            });
        }
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
