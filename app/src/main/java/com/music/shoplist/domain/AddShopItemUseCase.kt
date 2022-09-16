package com.music.shoplist.domain

class AddShopItemUseCase(private val shopListRepisitory: ShopListRepisitory) {

    fun addShopItem(shopItem: ShopItem) {
    shopListRepisitory.addShopItem(shopItem)
    }
}