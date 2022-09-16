package com.music.shoplist.domain

class GetShopItemIdUseCase(private val shopListRepisitory: ShopListRepisitory) {
    fun getShopItem(shopItemId:Int) : ShopItem?{
     return shopListRepisitory.getShopItem(shopItemId)
    }
}