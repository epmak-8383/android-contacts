package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import java.util.Objects;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public class BaseListDiffCallback<D extends ListDiffInterface> extends DiffUtil.ItemCallback<D> implements ListDiffInterface<D> {


    public boolean areItemsTheSame(@NonNull D oldItem, @NonNull D newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    public boolean areContentsTheSame(@NonNull D oldItem, @NonNull D newItem) {
        return newItem.theSameAs(newItem);
    }

    @Override
    public boolean theSameAs(D d){
        return this.hashCode() == d.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    public <ContactUI> boolean areContentsTheSame(ContactUI oldItem, ContactUi newItem) {
        return Objects.equals(oldItem, newItem);
    }

    public Object getChangePayload(ContactUi oldItem, ContactUi newItem) {
        return newItem;
    }
}