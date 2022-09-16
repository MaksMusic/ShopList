package com.music.shoplist.domain

class GetShopListUseCase(private val shopListRepisitory: ShopListRepisitory) {

    fun getShopList() : List<ShopItem> {
        return shopListRepisitory.getShopList()
    }
}