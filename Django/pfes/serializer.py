from rest_framework import serializers
from pfes.models import Type, Pfe


class TypeSerializer(serializers.ModelSerializer):
    class Meta:
        model = Type
        fields = ("__all__")


class PfeSerializer(serializers.ModelSerializer):

    class Meta:
        model = Pfe
        fields = ("__all__")
        depth = 1


class PfeSecondSerializer(serializers.ModelSerializer):

    class Meta:
        model = Pfe
        fields = ("__all__")
