package com.sofka.service;

import com.sofka.domain.CardDetail;

import java.util.List;
import java.util.Optional;

public interface ICardDetailService {
    public List<CardDetail> listCardDetail();

    public CardDetail saveCardDetail(CardDetail cardDetail);

    public Optional<CardDetail> findCardDetail(CardDetail cardDetail);
}
