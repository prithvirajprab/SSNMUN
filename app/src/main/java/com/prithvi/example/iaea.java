package com.prithvi.example;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class iaea extends Fragment implements View.OnClickListener {

    private OnFragmentInteractionListener mListener;

    TextView agenda;
    TextView councildescrip;
    TextView tchair;
    TextView tvchair;
    TextView tdirector;
    ImageView ichair;
    ImageView ivchair;
    ImageView idirector;
    Button country_matrix;
    TextView tv56;
    TextView tv58;
    Button allotments;
    Button study_guides;

    public static iaea newInstance() {
        iaea fragment = new iaea();
        return fragment;
    }

    public iaea() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_councils, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstaneState){

        super.onActivityCreated(savedInstaneState);

        agenda=(TextView) getView().findViewById(R.id.agenda);
        agenda.setText(R.string.aiaea);

        councildescrip=(TextView) getView().findViewById(R.id.councildescrip);
        councildescrip.setText(R.string.ciaea);
        country_matrix=(Button) getView().findViewById(R.id.country_matrix);
        country_matrix.setOnClickListener(this);
        country_matrix.setText("IAEACountryMatrix.pdf");
        allotments=(Button) getView().findViewById(R.id.allotments);
        allotments.setOnClickListener(this);
        allotments.setText("IAEAAllotments.pdf");
        study_guides=(Button) getView().findViewById(R.id.study_guides);
        study_guides.setOnClickListener(this);
        study_guides.setText("IAEAStudyGuides.pdf");

        tchair= (TextView) getView().findViewById(R.id.tchair);
        tchair.setText(R.string.AmanJ);

        tvchair= (TextView) getView().findViewById(R.id.tvchair);
        tvchair.setText("Vaibhav K");

        tdirector= (TextView) getView().findViewById(R.id.tdirector);
        tdirector.setText(R.string.Abijit);

        ichair=(ImageView) getView().findViewById(R.id.ichair);
        ichair.setImageResource(R.mipmap.aman_johri);

        ivchair=(ImageView) getView().findViewById(R.id.ivchair);
        ivchair.setImageResource(R.mipmap.vaibhav);

        idirector=(ImageView) getView().findViewById(R.id.idirector);
        idirector.setImageResource(R.mipmap.abijit);

        tv56=(TextView) getView().findViewById(R.id.textView56);
        tv56.setText("Chairperson");

        tv58=(TextView) getView().findViewById(R.id.textView58);
        tv58.setText("Vice-Chairperson");



    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        if(v==country_matrix)
        {
            String pdf_url="http://www.ssnmun.com/php_pdf/IAEA_CountryMatrix.pdf";
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(pdf_url));
            startActivity(browserIntent);
        }
        else if(v==allotments)
        {

            String pdf_url="http://www.ssnmun.com/php_pdf/IAEA_Allotments.pdf";
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(pdf_url));
            startActivity(browserIntent);
        }
        else if(v==study_guides)
        {

            String pdf_url="http://www.ssnmun.com/php_pdf/SSNMUN_IAEA_BG.pdf";
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(pdf_url));
            startActivity(browserIntent);
        }
    }


    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(Uri uri);
    }

}
