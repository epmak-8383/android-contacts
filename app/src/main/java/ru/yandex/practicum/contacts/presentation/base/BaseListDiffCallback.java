package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import java.util.Objects;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

// public class BaseListDiffCallback<D> extends DiffUtil.ItemCallback<D> implements ListDiffInterface<BaseListDiffCallback>
public class BaseListDiffCallback <D extends ListDiffInterface<D>> extends DiffUtil.ItemCallback<D> {


    public boolean areItemsTheSame(@NonNull D oldItem, @NonNull D newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    public boolean areContentsTheSame(@NonNull D oldItem, @NonNull D newItem) {
       // return oldItem.theSameAs(newItem);
        return Objects.equals(oldItem, newItem);
    }

    public boolean theSameAs(BaseListDiffCallback baseListDiffCallback){
        return this.hashCode() == baseListDiffCallback.hashCode();
    }

/*    public boolean theSameAs(BaseListDiffCallback baseListDiffCallback) {
        return this.hashCode() == baseListDiffCallback.hashCode();
    }*/

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