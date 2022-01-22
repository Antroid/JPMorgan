package com.jp.a20220124antonmakovnycschools.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.jp.a20220124antonmakovnycschools.R;
import com.jp.a20220124antonmakovnycschools.databinding.FragmentGradesBinding;

public class GradesFragment extends Fragment {

    private FragmentGradesBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentGradesBinding.inflate(inflater, container, false);
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
