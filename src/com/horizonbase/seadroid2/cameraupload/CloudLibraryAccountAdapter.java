package com.horizonbase.seadroid2.cameraupload;

import android.content.Context;

import com.horizonbase.seadroid2.ui.adapter.AccountAdapter;
import com.horizonbase.seadroid2.R;

/**
 * Adapter for choosing an cloud account
 */
public class CloudLibraryAccountAdapter extends AccountAdapter {

    public CloudLibraryAccountAdapter(Context context) {
        super(context);
    }

    @Override
    protected int getChildLayout() {
        return R.layout.cuc_account_list_item;
    }

    @Override
    protected int getChildTitleId() {
        return R.id.cuc_account_list_item_account_title;
    }

    @Override
    protected int getChildSubTitleId() {
        return R.id.cuc_account_list_item_account_subtitle;
    }

    @Override
    protected int getChildIconId() {
        return R.id.cuc_account_list_item_account_icon;
    }
}