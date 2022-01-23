package com.jp.a20220124antonmakovnycschools.fragments.schools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.jp.a20220124antonmakovnycschools.R;
import com.jp.a20220124antonmakovnycschools.databinding.FragmentSchoolsBinding;
import com.jp.a20220124antonmakovnycschools.viewmodels.SchoolsViewModel;

import dagger.android.support.DaggerFragment;

public class SchoolsFragment extends DaggerFragment {

    private FragmentSchoolsBinding binding;
    private SchoolsViewModel schoolsViewModel;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        schoolsViewModel = new ViewModelProvider(this).get(SchoolsViewModel.class);
        binding = FragmentSchoolsBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonGrades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SchoolsFragment.this)
                        .navigate(R.id.action_SchoolsFragment_to_GradesFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
