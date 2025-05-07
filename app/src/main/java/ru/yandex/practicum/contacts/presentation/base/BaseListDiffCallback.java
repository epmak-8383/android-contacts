package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import java.util.Objects;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public class BaseListDiffCallback<D> extends DiffUtil.ItemCallback<D> implements ListDiffInterface<BaseListDiffCallback> {


    public boolean areItemsTheSame(@NonNull D oldItem, @NonNull D newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    public boolean areContentsTheSame(@NonNull D oldItem, @NonNull D newItem) {
       // return oldItem.theSameAs(newItem);
        return Objects.equals(oldItem, newItem);
    }

  /*  @Override
    public boolean theSameAs(D d){
        return this.hashCode() == d.hashCode();
    }*/

    @Override
    public boolean theSameAs(BaseListDiffCallback baseListDiffCallback) {
        return this.hashCode() == baseListDiffCallback.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

/*    public boolean areContentsTheSame(ContactUi oldItem, ContactUi newItem) {
        return Objects.equals(oldItem, newItem);
    }*/


    public Object getChangePayload(@NonNull D oldItem, @NonNull D newItem) {
        return newItem;
    }
}