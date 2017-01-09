package com.design.structural.adapter;

import com.design.structural.adapter.alpha_framework.AlphaList;
import com.design.structural.adapter.alpha_framework.AlphaListManager;
import com.design.structural.adapter.beta_framework.BetaList;
import com.design.structural.adapter.beta_framework.BetaSaveManager;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class Main
{
    public static void main(String[] args)
    {
        AlphaList listAlpha = AlphaListManager.createList();
        BetaList listBeta = new ListAdapter(listAlpha);
        BetaSaveManager.saveList(listBeta);
    }
}
