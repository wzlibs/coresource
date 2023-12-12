package com.wzlibs.core

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/** BaseViewHolder is an abstract class for structuring the base view holder class. */
open class CoreViewHolder<T, V : ViewBinding>(val binding: V) :
    RecyclerView.ViewHolder(binding.root) {

    val context: Context = binding.root.context

    /** binds data to the view holder class. */
    @Throws(Exception::class)
    open fun bindData(data: T) {
    }

}