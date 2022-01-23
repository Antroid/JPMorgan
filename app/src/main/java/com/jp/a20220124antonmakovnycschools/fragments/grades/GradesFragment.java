package com.jp.a20220124antonmakovnycschools.fragments.grades;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;

import com.jp.a20220124antonmakovnycschools.databinding.FragmentGradesBinding;
import com.jp.a20220124antonmakovnycschools.viewmodels.GradesViewModel;

import dagger.android.support.DaggerFragment;

public class GradesFragment extends DaggerFragment {

    private FragmentGradesBinding binding;
    private GradesViewModel gradesViewModel;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        gradesViewModel =
                new ViewModelProvider(this).get(GradesViewModel.class);

        binding = FragmentGradesBinding.inflate(inflater, container, false);

        final TextView textView = binding.textviewSecond;
        gradesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
