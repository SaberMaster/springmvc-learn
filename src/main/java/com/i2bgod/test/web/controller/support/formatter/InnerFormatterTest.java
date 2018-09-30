package com.i2bgod.test.web.controller.support.formatter;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.format.number.CurrencyFormatter;
import org.springframework.format.support.DefaultFormattingConversionService;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Locale;

/**
 * @auther: Lyn
 * @data: 2018/9/27
 */
public class InnerFormatterTest {

    public static void main(String[] args) {
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
        // reg formatter
        CurrencyFormatter currencyFormatter = new CurrencyFormatter();
        currencyFormatter.setFractionDigits(2);
        currencyFormatter.setRoundingMode(RoundingMode.CEILING);
        conversionService.addFormatter(currencyFormatter);


        //bind local

        LocaleContextHolder.setLocale(Locale.US);
        System.out.println(conversionService.convert(new BigDecimal("1234.128"), String.class));
        LocaleContextHolder.setLocale(null);

        LocaleContextHolder.setLocale(Locale.CHINA);
        System.out.println(conversionService.convert("￥1234.128", BigDecimal.class));
        LocaleContextHolder.setLocale(null);

    }
}
